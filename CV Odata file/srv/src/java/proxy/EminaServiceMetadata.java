//# xsc 20.1.0-110dca-20191219

package com.opensap.mobile.emina.proxy;

public abstract class EminaServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = com.opensap.mobile.emina.proxy.EminaServiceMetadata.resolve();

    public static final com.sap.cloud.server.odata.MetadataLock lock = new com.sap.cloud.server.odata.MetadataLock();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:308:12
        com.opensap.mobile.emina.proxy.internal.EminaServiceFactory.registerAll();
        com.opensap.mobile.emina.proxy.internal.EminaServiceMetadataParser.parsed.setGeneratedProxies(true);
        return com.opensap.mobile.emina.proxy.internal.EminaServiceMetadataParser.parsed;
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType contact = com.opensap.mobile.emina.proxy.internal.EminaServiceMetadataParser.parsed.getEntityType("com.opensap.mobile.emina.Contact");

        public static final com.sap.cloud.server.odata.EntityType sectionsResume = com.opensap.mobile.emina.proxy.internal.EminaServiceMetadataParser.parsed.getEntityType("com.opensap.mobile.emina.Sections_Resume");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet contactSet = com.opensap.mobile.emina.proxy.internal.EminaServiceMetadataParser.parsed.getEntitySet("ContactSet");

        public static final com.sap.cloud.server.odata.EntitySet sectionsResumeSet = com.opensap.mobile.emina.proxy.internal.EminaServiceMetadataParser.parsed.getEntitySet("Sections_ResumeSet");
    }

    public abstract static class FunctionImports
    {
        public static final com.sap.cloud.server.odata.DataMethod getResume = com.opensap.mobile.emina.proxy.internal.EminaServiceMetadataParser.parsed.getDataMethod("GetResume");
    }
}
