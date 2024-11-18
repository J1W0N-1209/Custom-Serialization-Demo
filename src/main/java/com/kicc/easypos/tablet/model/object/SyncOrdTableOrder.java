package com.kicc.easypos.tablet.model.object;

import com.kicc.easypos.tablet.model.database.DataTableOrderClientCmd;
import com.kicc.easypos.tablet.model.database.DataTableOrderServerSync;
import com.kicc.easypos.tablet.model.database.OrdTableOrder;

import java.io.Serializable;

public class SyncOrdTableOrder implements Serializable {
    private DataTableOrderClientCmd dataTableOrderClientCmd;
    private DataTableOrderServerSync dataTableOrderServerSync;
    private OrdTableOrder ordTableOrder;

    public SyncOrdTableOrder() {
    }

    public SyncOrdTableOrder(DataTableOrderClientCmd dataTableOrderClientCmd, DataTableOrderServerSync dataTableOrderServerSync, OrdTableOrder ordTableOrder) {
        this.dataTableOrderClientCmd = dataTableOrderClientCmd;
        this.dataTableOrderServerSync = dataTableOrderServerSync;
        this.ordTableOrder = ordTableOrder;
    }

    public DataTableOrderClientCmd getDataTableOrderClientCmd() {
        return this.dataTableOrderClientCmd;
    }

    public void setDataTableOrderClientCmd(DataTableOrderClientCmd dataTableOrderClientCmd) {
        this.dataTableOrderClientCmd = dataTableOrderClientCmd;
    }

    public DataTableOrderServerSync getDataTableOrderServerSync() {
        return this.dataTableOrderServerSync;
    }

    public void setDataTableOrderServerSync(DataTableOrderServerSync dataTableOrderServerSync) {
        this.dataTableOrderServerSync = dataTableOrderServerSync;
    }

    public OrdTableOrder getOrdTableOrder() {
        return this.ordTableOrder;
    }

    public void setOrdTableOrder(OrdTableOrder ordTableOrder) {
        this.ordTableOrder = ordTableOrder;
    }
}
