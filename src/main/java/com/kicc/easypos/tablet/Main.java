package com.kicc.easypos.tablet;

import com.kicc.easypos.tablet.model.database.*;
import com.kicc.easypos.tablet.model.object.SyncOrdTableOrder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Base64;

public class    Main {
    public static void main(String[] args) {
        OrdTableOrder ordTableOrder = new OrdTableOrder();
        DataTableOrderClientCmd dataTableOrderClientCmd = new DataTableOrderClientCmd();
        DataTableOrderServerSync dataTableOrderServerSync = new DataTableOrderServerSync();

        dataTableOrderClientCmd.setTableIndex("1");
        dataTableOrderClientCmd.setSaleDate("20241101");
        dataTableOrderClientCmd.setDivSeq("1");
        dataTableOrderClientCmd.setOrderUniqueNo(1);
        dataTableOrderClientCmd.setProcFlag("I");
        dataTableOrderClientCmd.setTableGroupCode("1");
        dataTableOrderClientCmd.setTableCode("2");
        dataTableOrderServerSync.setTableIndex("20241026");
        dataTableOrderServerSync.setPosNo("2");
        ordTableOrder.setTableIndex("6");
        ordTableOrder.setPaymentFlag("1");
        ordTableOrder.setPaymentGroupCode(1);
        ordTableOrder.setOrderDatetime("20241102");
        ordTableOrder.setTableGroupCode("1");
        ordTableOrder.setGroupCode("1");
        ordTableOrder.setPosNo("1");
        ordTableOrder.setSaleDate("20241102");
        ordTableOrder.setOrderItem("제로콜라");
        ordTableOrder.setTotalAmt(1000.0);
        ordTableOrder.setOrderTableName("MYNAME IS JIWON!");
        SyncOrdTableOrder syncOrdTableOrder = new SyncOrdTableOrder(dataTableOrderClientCmd, dataTableOrderServerSync, ordTableOrder);

        OrdOrderPrint ordOrderPrint = new OrdOrderPrint();
        ordOrderPrint.setIndex("1");
        ordOrderPrint.setOrderPrint("myname is jiwon kang !");

        ArrayList arrayList = new ArrayList();
        OrdKdsDetail ordKdsDetail = new OrdKdsDetail();
        ordKdsDetail.setIndex("1337");
        ordKdsDetail.setItemName("jiiiiwooon");
        arrayList.add(ordKdsDetail);
        try {
            String base64Data = serializeToBase64(syncOrdTableOrder);
            String base64Data2 = serializeToBase64(ordOrderPrint);
            String base64Data3 = serializeToBase64(arrayList);
            System.out.println("1./order/insertTableOrder : " + base64Data);
            System.out.println("2./order/insertKitchenPrinter : " + base64Data2);
            System.out.println("3./order/insertKitchenDisplaySystem  : " + base64Data3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String serializeToBase64(Object object) throws IOException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            objectOutputStream.writeObject(object);
            return Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
        }
    }
}
