// Note: This handler will be overwritten if the service is regenerated.
// To allow customization and avoid overwriting upon service regeneration,
// please delete this comment.

package com.opensap.mobile.emina.handler;

import com.sap.cloud.server.odata.*;

public class SectionsResumeHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private com.opensap.mobile.emina.MainServlet servlet;
    private com.opensap.mobile.emina.proxy.EminaService service;

    public SectionsResumeHandler(com.opensap.mobile.emina.MainServlet servlet, com.opensap.mobile.emina.proxy.EminaService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
        allowUnused(this.servlet);
        allowUnused(this.service);
    }

    @Override public DataValue executeQuery(DataQuery query) {
        return service.executeQuery(query).getResult();
    }

    @Override public void createEntity(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.SectionsResume entity = (com.opensap.mobile.emina.proxy.SectionsResume)entityValue;
        service.createEntity(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.SectionsResume entity = (com.opensap.mobile.emina.proxy.SectionsResume)entityValue;
        entity.setMustBeModified(true);
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.SectionsResume entity = (com.opensap.mobile.emina.proxy.SectionsResume)entityValue;
        service.deleteEntity(entity);
    }
}
