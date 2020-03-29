//# xsc 20.1.0-110dca-20191219

package com.opensap.mobile.emina.proxy.internal;

public abstract class Any_as_com_opensap_mobile_emina_proxy_Contact
{
    public static com.opensap.mobile.emina.proxy.Contact cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/c6499758-4f13-4434-a420-28fbaba2c373/output/target/tmp/proxy-com.opensap.mobile.emina.csdl.xs:650:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof com.opensap.mobile.emina.proxy.Contact)
        {
            final com.opensap.mobile.emina.proxy.Contact var_value = ((com.opensap.mobile.emina.proxy.Contact)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.opensap.mobile.emina.proxy.Contact");
        }
    }
}
