// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of listener registration in the ProviderSettings class.

package com.opensap.mobile.emina.base;

import com.sap.cloud.server.odata.*;

class RegisterListeners {
    private static EntityListener contactListener;
    private static EntityListener sectionsResumeListener;

    public static void withServlet(com.opensap.mobile.emina.MainServlet servlet) {
        com.opensap.mobile.emina.proxy.EminaService service = (com.opensap.mobile.emina.proxy.EminaService)servlet.getDataService();
        contactListener = new com.opensap.mobile.emina.listener.ContactListener(servlet, service);
        sectionsResumeListener = new com.opensap.mobile.emina.listener.SectionsResumeListener(servlet, service);
        servlet.registerEntityListener(com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.contact, contactListener);
        servlet.registerEntityListener(com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume, sectionsResumeListener);
    }
}
