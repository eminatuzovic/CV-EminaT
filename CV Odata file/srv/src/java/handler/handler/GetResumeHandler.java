package com.opensap.mobile.emina.handler;

import com.sap.cloud.server.odata.*;

public class GetResumeHandler extends com.sap.cloud.server.odata.DefaultMethodHandler {
    private com.opensap.mobile.emina.MainServlet servlet;
    private com.opensap.mobile.emina.proxy.EminaService service;

    public GetResumeHandler(com.opensap.mobile.emina.MainServlet servlet, com.opensap.mobile.emina.proxy.EminaService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
        allowUnused(this.servlet);
        allowUnused(this.service);
    }

    @Override public DataValue executeMethod(DataMethod method, ParameterList parameters) {
        long Sections_ResumeID = LongValue.unwrap(parameters.getRequired("Sections_ResumeID"));
        long ContactID = LongValue.unwrap(parameters.getRequired("ContactID"));
        com.opensap.mobile.emina.proxy.SectionsResume input = getResume(Sections_ResumeID, ContactID);
        return (com.opensap.mobile.emina.proxy.SectionsResume)input;
    }

    public com.opensap.mobile.emina.proxy.SectionsResume getResume(long Sections_ResumeID, long ContactID) {
        // Method implementation code should be placed here...
        throw DataServiceException.notImplemented("GetResume");
    }
}
