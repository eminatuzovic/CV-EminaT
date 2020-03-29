//# xsc 20.1.0-110dca-20191219

package com.opensap.mobile.emina.proxy;

public class SectionsResume
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property contactID = com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume.getProperty("ContactID");

    public static final com.sap.cloud.server.odata.Property education = com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume.getProperty("Education");

    public static final com.sap.cloud.server.odata.Property experience = com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume.getProperty("Experience");

    public static final com.sap.cloud.server.odata.Property languages = com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume.getProperty("Languages");

    public static final com.sap.cloud.server.odata.Property personnal = com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume.getProperty("Personnal");

    public static final com.sap.cloud.server.odata.Property sectionsResumeID = com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume.getProperty("Sections_ResumeID");

    public static final com.sap.cloud.server.odata.Property skills = com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume.getProperty("Skills");

    public static final com.sap.cloud.server.odata.Property summary = com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume.getProperty("Summary");

    public static final com.sap.cloud.server.odata.Property inSectionsResume = com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume.getProperty("inSections_Resume");

    public SectionsResume()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:111:5
        this(true);
    }

    public SectionsResume(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:111:5
        super(withDefaults, com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume);
    }

    public com.opensap.mobile.emina.proxy.SectionsResume copy()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:96:5
        return com.opensap.mobile.emina.proxy.internal.Any_as_com_opensap_mobile_emina_proxy_SectionsResume.cast(this.copyEntity());
    }

    public long getContactID()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:142:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.opensap.mobile.emina.proxy.SectionsResume.contactID));
    }

    public String getEducation()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:155:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.opensap.mobile.emina.proxy.SectionsResume.education));
    }

    public String getExperience()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:168:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.opensap.mobile.emina.proxy.SectionsResume.experience));
    }

    public com.opensap.mobile.emina.proxy.Contact getInSectionsResume()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:246:5
        return com.opensap.mobile.emina.proxy.internal.Any_as_com_opensap_mobile_emina_proxy_Contact.cast(this.getDataValue(com.opensap.mobile.emina.proxy.SectionsResume.inSectionsResume));
    }

    public String getLanguages()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:181:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.opensap.mobile.emina.proxy.SectionsResume.languages));
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getOld()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:91:5
        return com.opensap.mobile.emina.proxy.internal.Any_as_com_opensap_mobile_emina_proxy_SectionsResume.cast(this.getOldEntity());
    }

    public String getPersonnal()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:194:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.opensap.mobile.emina.proxy.SectionsResume.personnal));
    }

    public long getSectionsResumeID()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:207:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.opensap.mobile.emina.proxy.SectionsResume.sectionsResumeID));
    }

    public String getSkills()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:220:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.opensap.mobile.emina.proxy.SectionsResume.skills));
    }

    public String getSummary()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:233:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.opensap.mobile.emina.proxy.SectionsResume.summary));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:84:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long sectionsResumeID)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:101:12
        return new com.sap.cloud.server.odata.EntityKey().with("Sections_ResumeID", com.sap.cloud.server.odata.LongValue.of(sectionsResumeID));
    }

    public static com.opensap.mobile.emina.proxy.SectionsResumeList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:106:12
        return com.opensap.mobile.emina.proxy.SectionsResumeList.share(from);
    }

    public void setContactID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:147:5
        this.setDataValue(com.opensap.mobile.emina.proxy.SectionsResume.contactID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setEducation(final String value)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:160:5
        this.setDataValue(com.opensap.mobile.emina.proxy.SectionsResume.education, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setExperience(final String value)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:173:5
        this.setDataValue(com.opensap.mobile.emina.proxy.SectionsResume.experience, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setInSectionsResume(final com.opensap.mobile.emina.proxy.Contact value)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:251:5
        this.setDataValue(com.opensap.mobile.emina.proxy.SectionsResume.inSectionsResume, value);
    }

    public void setLanguages(final String value)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:186:5
        this.setDataValue(com.opensap.mobile.emina.proxy.SectionsResume.languages, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setPersonnal(final String value)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:199:5
        this.setDataValue(com.opensap.mobile.emina.proxy.SectionsResume.personnal, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setSectionsResumeID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:212:5
        this.setDataValue(com.opensap.mobile.emina.proxy.SectionsResume.sectionsResumeID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setSkills(final String value)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:225:5
        this.setDataValue(com.opensap.mobile.emina.proxy.SectionsResume.skills, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setSummary(final String value)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:238:5
        this.setDataValue(com.opensap.mobile.emina.proxy.SectionsResume.summary, com.sap.cloud.server.odata.StringValue.of(value));
    }
}
