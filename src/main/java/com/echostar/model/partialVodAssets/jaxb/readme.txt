copy all the new partial-vod-assets.xsd and dependent xsd files to the xsd directory
cd heimdall-v2/xsd
java -jar JAXB/jaxb-xjc.jar partial-vod-assets.xsd -d . -p com.echostar.model.partialVodAssets.jaxb
cp -rf com ../src/main/java/