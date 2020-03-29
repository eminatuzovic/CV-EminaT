// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of handler registration in the ProviderSettings class.

package com.opensap.mobile.emina.base;

import com.sap.cloud.server.odata.*;

class RegisterHandlers {
    private static EntityHandler handler_Contact;
    private static EntityHandler handler_Sections_Resume;

    public static void withServlet(com.opensap.mobile.emina.MainServlet servlet) {
        com.opensap.mobile.emina.proxy.EminaService service = (com.opensap.mobile.emina.proxy.EminaService)servlet.getDataService();
        handler_Contact = new com.opensap.mobile.emina.handler.ContactHandler(servlet, service);
        handler_Sections_Resume = new com.opensap.mobile.emina.handler.SectionsResumeHandler(servlet, service);
        servlet.registerEntityHandler(com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.contact, handler_Contact);
        servlet.registerEntityHandler(com.opensap.mobile.emina.proxy.EminaServiceMetadata.EntityTypes.sectionsResume, handler_Sections_Resume);
        servlet.registerMethodHandler(com.opensap.mobile.emina.proxy.EminaServiceMetadata.FunctionImports.getResume, new com.opensap.mobile.emina.handler.GetResumeHandler(servlet, service));
    }
}
