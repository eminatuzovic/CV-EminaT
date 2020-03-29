package com.opensap.mobile.emina.listener;

import com.sap.cloud.server.odata.*;

public class ContactListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private com.opensap.mobile.emina.MainServlet servlet;
    private com.opensap.mobile.emina.proxy.EminaService service;

    public ContactListener(com.opensap.mobile.emina.MainServlet servlet, com.opensap.mobile.emina.proxy.EminaService service) {
        super();
        this.servlet = servlet;
        this.service = service;
        allowUnused(this.servlet);
        allowUnused(this.service);
    }

    @Override public void beforeQuery(DataQuery query) {
        allowUnused(query);
    }

    public void beforeSave(EntityValue entityValue) {
        // Shared code for beforeCreate / beforeUpdate.
        com.opensap.mobile.emina.proxy.Contact entity = (com.opensap.mobile.emina.proxy.Contact)entityValue;
        allowUnused(entity);
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.Contact entity = (com.opensap.mobile.emina.proxy.Contact)entityValue;
        allowUnused(entity);
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.Contact entity = (com.opensap.mobile.emina.proxy.Contact)entityValue;
        allowUnused(entity);
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.Contact entity = (com.opensap.mobile.emina.proxy.Contact)entityValue;
        allowUnused(entity);
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        com.opensap.mobile.emina.proxy.Contact entity = (com.opensap.mobile.emina.proxy.Contact)entityValue;
        allowUnused(entity);
    }

    @Override public void afterCreate(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.Contact entity = (com.opensap.mobile.emina.proxy.Contact)entityValue;
        allowUnused(entity);
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.Contact entity = (com.opensap.mobile.emina.proxy.Contact)entityValue;
        allowUnused(entity);
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.Contact entity = (com.opensap.mobile.emina.proxy.Contact)entityValue;
        allowUnused(entity);
    }
}
