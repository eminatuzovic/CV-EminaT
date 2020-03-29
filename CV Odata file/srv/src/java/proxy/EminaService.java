//# xsc 20.1.0-110dca-20191219

package com.opensap.mobile.emina.proxy;

public class EminaService
    extends com.sap.cloud.server.odata.DataService
{
    public EminaService()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:372:5
        this(null);
    }

    public EminaService(final com.sap.cloud.server.odata.DataServiceProvider provider)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:372:5
        super(com.sap.cloud.server.odata.MetadataOnlyProvider.newIfNull(provider, "EminaService"));
        this.getProvider().setMetadata(com.opensap.mobile.emina.proxy.EminaServiceMetadata.document);
    }

    public com.opensap.mobile.emina.proxy.Contact getContact(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:384:5
        return this.getContact(query, null, null);
    }

    public com.opensap.mobile.emina.proxy.Contact getContact(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:384:5
        return this.getContact(query, headers, null);
    }

    public com.opensap.mobile.emina.proxy.Contact getContact(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:384:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.opensap.mobile.emina.proxy.internal.Any_as_com_opensap_mobile_emina_proxy_Contact.cast(this.executeQuery(query.fromDefault(com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntitySets.contactSet), var_headers, var_options).getRequiredEntity());
    }

    public com.opensap.mobile.emina.proxy.ContactList getContactSet()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:399:5
        return this.getContactSet(null, null, null);
    }

    public com.opensap.mobile.emina.proxy.ContactList getContactSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:399:5
        return this.getContactSet(query, null, null);
    }

    public com.opensap.mobile.emina.proxy.ContactList getContactSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:399:5
        return this.getContactSet(query, headers, null);
    }

    public com.opensap.mobile.emina.proxy.ContactList getContactSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:399:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.opensap.mobile.emina.proxy.Contact.list(this.executeQuery(var_query.fromDefault(com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntitySets.contactSet), var_headers, var_options).getEntityList());
    }

    public com.opensap.mobile.emina.proxy.Contact getContactWithKey(final long contactID)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:392:5
        return this.getContactWithKey(contactID, null, null, null);
    }

    public com.opensap.mobile.emina.proxy.Contact getContactWithKey(final long contactID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:392:5
        return this.getContactWithKey(contactID, query, null, null);
    }

    public com.opensap.mobile.emina.proxy.Contact getContactWithKey(final long contactID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:392:5
        return this.getContactWithKey(contactID, query, headers, null);
    }

    public com.opensap.mobile.emina.proxy.Contact getContactWithKey(final long contactID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:392:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getContact(var_query.withKey(com.opensap.mobile.emina.proxy.Contact.key(contactID)), headers, options);
    }

    @java.lang.Override public com.sap.cloud.server.odata.MetadataLock getMetadataLock()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:359:5
        return com.opensap.mobile.emina.proxy.EminaServiceMetadata.lock;
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getResume(final long sectionsResumeID, final long contactID)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:611:5
        return this.getResume(sectionsResumeID, contactID, null, null, null);
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getResume(final long sectionsResumeID, final long contactID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:611:5
        return this.getResume(sectionsResumeID, contactID, query, null, null);
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getResume(final long sectionsResumeID, final long contactID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:611:5
        return this.getResume(sectionsResumeID, contactID, query, headers, null);
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getResume(final long sectionsResumeID, final long contactID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:611:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.opensap.mobile.emina.proxy.internal.Any_as_com_opensap_mobile_emina_proxy_SectionsResume.cast(this.executeQuery(var_query.invoke(com.opensap.mobile.emina.proxy.EminaServiceMetadata.FunctionImports.getResume, new com.sap.cloud.server.odata.ParameterList(2).with("Sections_ResumeID", com.sap.cloud.server.odata.LongValue.of(sectionsResumeID)).with("ContactID", com.sap.cloud.server.odata.LongValue.of(contactID))), var_headers, var_options).getResult());
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getSectionsResume(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:498:5
        return this.getSectionsResume(query, null, null);
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getSectionsResume(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:498:5
        return this.getSectionsResume(query, headers, null);
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getSectionsResume(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:498:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.opensap.mobile.emina.proxy.internal.Any_as_com_opensap_mobile_emina_proxy_SectionsResume.cast(this.executeQuery(query.fromDefault(com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntitySets.sectionsResumeSet), var_headers, var_options).getRequiredEntity());
    }

    public com.opensap.mobile.emina.proxy.SectionsResumeList getSectionsResumeSet()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:513:5
        return this.getSectionsResumeSet(null, null, null);
    }

    public com.opensap.mobile.emina.proxy.SectionsResumeList getSectionsResumeSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:513:5
        return this.getSectionsResumeSet(query, null, null);
    }

    public com.opensap.mobile.emina.proxy.SectionsResumeList getSectionsResumeSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:513:5
        return this.getSectionsResumeSet(query, headers, null);
    }

    public com.opensap.mobile.emina.proxy.SectionsResumeList getSectionsResumeSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:513:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.opensap.mobile.emina.proxy.SectionsResume.list(this.executeQuery(var_query.fromDefault(com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntitySets.sectionsResumeSet), var_headers, var_options).getEntityList());
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getSectionsResumeWithKey(final long sectionsResumeID)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:506:5
        return this.getSectionsResumeWithKey(sectionsResumeID, null, null, null);
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getSectionsResumeWithKey(final long sectionsResumeID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:506:5
        return this.getSectionsResumeWithKey(sectionsResumeID, query, null, null);
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getSectionsResumeWithKey(final long sectionsResumeID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:506:5
        return this.getSectionsResumeWithKey(sectionsResumeID, query, headers, null);
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getSectionsResumeWithKey(final long sectionsResumeID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:506:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getSectionsResume(var_query.withKey(com.opensap.mobile.emina.proxy.SectionsResume.key(sectionsResumeID)), headers, options);
    }

    @java.lang.Override public void refreshMetadata()
    {
        synchronized (this)
        {
            //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:378:19
            com.sap.cloud.server.odata.ProxyInternal.noRefreshMetadata();
        }
    }
}
