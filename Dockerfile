FROM ubuntu AS builder1
RUN apt update &&\
    apt install -y wget protobuf-compiler unzip
WORKDIR /tmp
COPY init.sh .
RUN ./init.sh

FROM ubuntu
COPY --from=builder1 /tmp/qauld /tmp/qaul-cli /usr/bin/
EXPOSE 9229
CMD ["qauld"]
