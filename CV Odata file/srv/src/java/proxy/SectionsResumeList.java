//# xsc 20.1.0-110dca-20191219

package com.opensap.mobile.emina.proxy;

public class SectionsResumeList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.opensap.mobile.emina.proxy.SectionsResume>
{
    public static final com.opensap.mobile.emina.proxy.SectionsResumeList empty = new com.opensap.mobile.emina.proxy.SectionsResumeList(java.lang.Integer.MIN_VALUE);

    public SectionsResumeList()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        this(4);
    }

    public SectionsResumeList(final int capacity)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        super(capacity);
    }

    public void add(final com.opensap.mobile.emina.proxy.SectionsResume item)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:50:5
        this.getUntypedList().add(this.validate(((Object)item)));
    }

    public void addAll(final com.opensap.mobile.emina.proxy.SectionsResumeList list)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:59:5
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public com.opensap.mobile.emina.proxy.SectionsResumeList addThis(final com.opensap.mobile.emina.proxy.SectionsResume item)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:70:5
        this.add(item);
        return this;
    }

    public com.opensap.mobile.emina.proxy.SectionsResumeList copy()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:78:5
        return this.slice(0);
    }

    public com.opensap.mobile.emina.proxy.SectionsResume first()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:86:5
        return com.opensap.mobile.emina.proxy.internal.Any_as_com_opensap_mobile_emina_proxy_SectionsResume.cast(this.getUntypedList().first());
    }

    public static com.opensap.mobile.emina.proxy.SectionsResumeList from(final java.util.List<com.opensap.mobile.emina.proxy.SectionsResume> list)
    {
        return SectionsResumeList.share(new com.sap.cloud.server.odata.core.GenericList<com.opensap.mobile.emina.proxy.SectionsResume>(list).toAnyList());
    }

    public com.opensap.mobile.emina.proxy.SectionsResume get(final int index)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:96:5
        return com.opensap.mobile.emina.proxy.internal.Any_as_com_opensap_mobile_emina_proxy_SectionsResume.cast(this.getUntypedList().get(index));
    }

    public boolean includes(final com.opensap.mobile.emina.proxy.SectionsResume item)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:104:5
        return this.indexOf(item) != -1;
    }

    public int indexOf(final com.opensap.mobile.emina.proxy.SectionsResume item)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.indexOf(item, 0);
    }

    public int indexOf(final com.opensap.mobile.emina.proxy.SectionsResume item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public void insertAll(final int index, final com.opensap.mobile.emina.proxy.SectionsResumeList list)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:135:5
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public void insertAt(final int index, final com.opensap.mobile.emina.proxy.SectionsResume item)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:124:5
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.opensap.mobile.emina.proxy.SectionsResume> iterator()
    {
        return this.toGeneric().iterator();
    }

    public com.opensap.mobile.emina.proxy.SectionsResume last()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:143:5
        return com.opensap.mobile.emina.proxy.internal.Any_as_com_opensap_mobile_emina_proxy_SectionsResume.cast(this.getUntypedList().last());
    }

    public int lastIndexOf(final com.opensap.mobile.emina.proxy.SectionsResume item)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.lastIndexOf(item, 2147483647);
    }

    public int lastIndexOf(final com.opensap.mobile.emina.proxy.SectionsResume item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public void set(final int index, final com.opensap.mobile.emina.proxy.SectionsResume item)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:162:5
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.opensap.mobile.emina.proxy.SectionsResumeList share(final com.sap.cloud.server.odata.ListBase list)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:24:12
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.opensap.mobile.emina.proxy.SectionsResumeList result = new com.opensap.mobile.emina.proxy.SectionsResumeList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.opensap.mobile.emina.proxy.SectionsResume)
                {
                    final com.opensap.mobile.emina.proxy.SectionsResume var_item = ((com.opensap.mobile.emina.proxy.SectionsResume)item);
                    result.add(var_item);
                }
                else
                {
                    replace = true;
                }
            }
        }
        result.shareWith(list, replace);
        return result;
    }

    public com.opensap.mobile.emina.proxy.SectionsResume single()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:171:5
        return com.opensap.mobile.emina.proxy.internal.Any_as_com_opensap_mobile_emina_proxy_SectionsResume.cast(this.getUntypedList().single());
    }

    public com.opensap.mobile.emina.proxy.SectionsResumeList slice(final int start)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        return this.slice(start, 2147483647);
    }

    public com.opensap.mobile.emina.proxy.SectionsResumeList slice(final int start, final int end)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:664:42 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.opensap.mobile.emina.proxy.SectionsResumeList result = new com.opensap.mobile.emina.proxy.SectionsResumeList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    @java.lang.Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:666:5
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:671:5
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume);
    }

    public java.util.List<com.opensap.mobile.emina.proxy.SectionsResume> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.opensap.mobile.emina.proxy.SectionsResume>(this);
    }
}
