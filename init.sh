cd `dirname $0`


PLUGIN_TMP_FILE="linux-cli-binaries.zip"
latest_url="https://api.github.com/repos/qaul/qaul.net/releases/latest"

# Download header file
DOWNLOAD_URL=`wget -q -O - $latest_url| awk '/\"browser_download_url\":/{gsub( /[,\"]/,"", $2); print $2}'|grep $PLUGIN_TMP_FILE`
if [ -z "$DownloadURL" ]; then
echo "USE DEFAULT VALUE"
DOWNLOAD_URL="https://github.com/qaul/qaul.net/releases/download/v2.0.0-beta.12/linux-cli-binaries.zip"
fi
set -e
echo "TO DOWNLOAD $DOWNLOAD_URL"
wget $DOWNLOAD_URL &&\
    unzip linux-cli-binaries &&\
    chmod +x qauld qaul-cli

echo "DOWNLOADED"
exit 0