package com.opensap.mobile.emina.listener;

import com.sap.cloud.server.odata.*;

public class SectionsResumeListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private com.opensap.mobile.emina.MainServlet servlet;
    private com.opensap.mobile.emina.proxy.EminaService service;

    public SectionsResumeListener(com.opensap.mobile.emina.MainServlet servlet, com.opensap.mobile.emina.proxy.EminaService service) {
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
        com.opensap.mobile.emina.proxy.SectionsResume entity = (com.opensap.mobile.emina.proxy.SectionsResume)entityValue;
        allowUnused(entity);
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.SectionsResume entity = (com.opensap.mobile.emina.proxy.SectionsResume)entityValue;
        allowUnused(entity);
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.SectionsResume entity = (com.opensap.mobile.emina.proxy.SectionsResume)entityValue;
        allowUnused(entity);
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.SectionsResume entity = (com.opensap.mobile.emina.proxy.SectionsResume)entityValue;
        allowUnused(entity);
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        com.opensap.mobile.emina.proxy.SectionsResume entity = (com.opensap.mobile.emina.proxy.SectionsResume)entityValue;
        allowUnused(entity);
    }

    @Override public void afterCreate(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.SectionsResume entity = (com.opensap.mobile.emina.proxy.SectionsResume)entityValue;
        allowUnused(entity);
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.SectionsResume entity = (com.opensap.mobile.emina.proxy.SectionsResume)entityValue;
        allowUnused(entity);
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        com.opensap.mobile.emina.proxy.SectionsResume entity = (com.opensap.mobile.emina.proxy.SectionsResume)entityValue;
        allowUnused(entity);
    }
}
