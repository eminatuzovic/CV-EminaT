//# xsc 20.1.0-110dca-20191219

package com.opensap.mobile.emina.proxy.internal;

public abstract class EminaServiceFactory
{
    public static void registerAll()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:318:12
        com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.contact.registerFactory(new com.opensap.mobile.emina.proxy.internal.EminaServiceFactory.CreateContact());
        com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume.registerFactory(new com.opensap.mobile.emina.proxy.internal.EminaServiceFactory.CreateSectionsResume());
    }

    public static class CreateContact
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:338:9
            return new com.opensap.mobile.emina.proxy.Contact(false);
        }
    }

    public static class CreateSectionsResume
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:348:9
            return new com.opensap.mobile.emina.proxy.SectionsResume(false);
        }
    }
}
