//# xsc 20.1.0-110dca-20191219

package com.opensap.mobile.emina.proxy;

public class Contact
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property contactID = com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.contact.getProperty("ContactID");

    public static final com.sap.cloud.server.odata.Property contactEmina = com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.contact.getProperty("Contact_Emina");

    public Contact()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:35:5
        this(true);
    }

    public Contact(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:35:5
        super(withDefaults, com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.contact);
    }

    public com.opensap.mobile.emina.proxy.Contact copy()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:20:5
        return com.opensap.mobile.emina.proxy.internal.Any_as_com_opensap_mobile_emina_proxy_Contact.cast(this.copyEntity());
    }

    public com.opensap.mobile.emina.proxy.SectionsResumeList getContactEmina()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:65:5
        return com.opensap.mobile.emina.proxy.SectionsResumeList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.opensap.mobile.emina.proxy.Contact.contactEmina)));
    }

    public long getContactID()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:52:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.opensap.mobile.emina.proxy.Contact.contactID));
    }

    public com.opensap.mobile.emina.proxy.Contact getOld()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:15:5
        return com.opensap.mobile.emina.proxy.internal.Any_as_com_opensap_mobile_emina_proxy_Contact.cast(this.getOldEntity());
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:8:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long contactID)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:25:12
        return new com.sap.cloud.server.odata.EntityKey().with("ContactID", com.sap.cloud.server.odata.LongValue.of(contactID));
    }

    public static com.opensap.mobile.emina.proxy.ContactList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:30:12
        return com.opensap.mobile.emina.proxy.ContactList.share(from);
    }

    public void setContactEmina(final com.opensap.mobile.emina.proxy.SectionsResumeList value)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:70:5
        com.opensap.mobile.emina.proxy.Contact.contactEmina.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setContactID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:57:5
        this.setDataValue(com.opensap.mobile.emina.proxy.Contact.contactID, com.sap.cloud.server.odata.LongValue.of(value));
    }
}
