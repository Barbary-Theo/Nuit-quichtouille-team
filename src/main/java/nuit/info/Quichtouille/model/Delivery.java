package nuit.info.Quichtouille.model;

import javax.persistence.*;
import java.util.Date;

public class Delivery implements java.io.Serializable {

    private static final long serialVersionUID = 778511598069398358L;
    private long id;
    private String road;
    private Integer deliverystop;
    private Double leadtime;
    private Integer leadtimeveh;
    private Integer planneddelseq;
    private Integer actualdelseq;
    private String stopaddr;
    private String address;
    private String pn12;
    private String kanban;
    private String dolly;
    private Integer nbbox;
    private String manifest;
    private String doneby;
    private Date deliverydate;
    private Integer cycle;
    private String included;
    private String dockcode;
    private String suppliercode;
    private String deliverymethod;
    private Integer ordergroup;
    private Integer nbvalid;
    private String invoicenumber;
    private String delmethroad;
    private String highlighted;
    private Integer orderlot;

    public Delivery() {
    }

    public Delivery(String road, Integer deliverystop, Double leadtime, Integer leadtimeveh, Integer planneddelseq,Integer actualdelseq, String stopaddr, String address, String pn12,
                    String kanban, String dolly, Integer nbbox, String manifest, String doneby, Date deliverydate,
                    Integer cycle, String included, String deliverymethod, Integer ordergroup, Integer nbvalid, String invoicenumber) {
        this.road = road;
        this.deliverystop = deliverystop;
        this.leadtime = leadtime;
        this.leadtimeveh = leadtimeveh;
        this.planneddelseq = planneddelseq;
        this.actualdelseq = actualdelseq;
        this.stopaddr = stopaddr;
        this.address = address;
        this.pn12 = pn12;
        this.kanban = kanban;
        this.dolly = dolly;
        this.nbbox = nbbox;
        this.manifest = manifest;
        this.doneby = doneby;
        this.deliverydate = deliverydate;
        this.cycle = cycle;
        this.included = included;
        this.deliverymethod = deliverymethod;
        this.invoicenumber = invoicenumber;
        if (nbvalid==null || nbvalid<0){
            nbvalid=0;
        }
        this.nbvalid = nbvalid;
        if (ordergroup!=null){
            this.ordergroup = ordergroup;
        }else{
            this.ordergroup = -1;
        }
    }

    public Delivery(String road, Integer deliverystop, Double leadtime, Integer leadtimeveh, Integer planneddelseq,Integer actualdelseq, String stopaddr, String address, String pn12,
                    String kanban, String dolly, Integer nbbox, String manifest, String doneby, Date deliverydate,
                    Integer cycle, String included, String dockcode, String suppliercode, Integer ordergroup, Integer nbvalid, String invoicenumber, String delmethroad, String highlighted) {
        this.road = road;
        this.deliverystop = deliverystop;
        this.leadtime = leadtime;
        this.leadtimeveh = leadtimeveh;
        this.planneddelseq = planneddelseq;
        this.actualdelseq = actualdelseq;
        this.stopaddr = stopaddr;
        this.address = address;
        this.pn12 = pn12;
        this.kanban = kanban;
        this.dolly = dolly;
        this.nbbox = nbbox;
        this.manifest = manifest;
        this.doneby = doneby;
        this.deliverydate = deliverydate;
        this.cycle = cycle;
        this.included = included;
        this.dockcode = dockcode;
        this.suppliercode = suppliercode;
        this.invoicenumber = invoicenumber;
        if (nbvalid==null || nbvalid<0){
            nbvalid=0;
        }
        this.nbvalid = nbvalid;
        if (ordergroup!=null){
            this.ordergroup = ordergroup;
        }else{
            this.ordergroup = -1;
        }
        this.delmethroad = delmethroad;
        if(highlighted != null){
            this.highlighted = highlighted;
        }else{
            this.highlighted = "N";
        }
    }

    @Id
    @GeneratedValue

    @Column(name = "id", unique = true, nullable = false)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "road", length = 8)
    public String getRoad() {
        return this.road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    @Column(name = "deliverystop")
    public Integer getDeliverystop() {
        return this.deliverystop;
    }

    public void setDeliverystop(Integer deliverystop) {
        this.deliverystop = deliverystop;
    }

    @Column(name = "leadtime", precision = 53, scale = 0)
    public Double getLeadtime() {
        return this.leadtime;
    }

    public void setLeadtime(Double leadtime) {
        this.leadtime = leadtime;
    }

    @Column(name = "leadtimeveh")
    public Integer getLeadtimeveh() {
        return leadtimeveh;
    }

    public void setLeadtimeveh(Integer leadtimeveh) {
        this.leadtimeveh = leadtimeveh;
    }

    @Column(name = "planneddelseq")
    public Integer getPlanneddelseq() {
        return planneddelseq;
    }

    public void setPlanneddelseq(Integer planneddelseq) {
        this.planneddelseq = planneddelseq;
    }

    @Column(name = "actualdelseq")
    public Integer getActualdelseq() {
        return actualdelseq;
    }

    public void setActualdelseq(Integer actualdelseq) {
        this.actualdelseq = actualdelseq;
    }

    @Column(name = "stopaddr", length = 50)
    public String getStopaddr() {
        return this.stopaddr;
    }

    public void setStopaddr(String stopaddr) {
        this.stopaddr = stopaddr;
    }

    @Column(name = "address", length = 50)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "pn12", length = 13)
    public String getPn12() {
        return this.pn12;
    }

    public void setPn12(String pn12) {
        this.pn12 = pn12;
    }

    @Column(name = "kanban", length = 20)
    public String getKanban() {
        return this.kanban;
    }

    public void setKanban(String kanban) {
        this.kanban = kanban;
    }

    @Column(name = "dolly", length = 50)
    public String getDolly() {
        return this.dolly;
    }

    public void setDolly(String dolly) {
        this.dolly = dolly;
    }

    @Column(name = "nbbox")
    public Integer getNbbox() {
        return this.nbbox;
    }

    public void setNbbox(Integer nbbox) {
        this.nbbox = nbbox;
    }

    @Column(name = "manifest", length = 14)
    public String getManifest() {
        return this.manifest;
    }

    public void setManifest(String manifest) {
        this.manifest = manifest;
    }





    @Override
    public String toString() {
        return "{\"id\": \"" + id + "\", \"road\": \"" + road + "\", \"deliverystop\": \"" + deliverystop + "\", \"leadtime\": \"" + leadtime
                + "\", \"leadtimeveh\": \"" + leadtimeveh + "\", \"planneddelseq\": \"" + planneddelseq + "\", \"actualdelseq\": \"" + actualdelseq
                + "\", \"stopaddr\": \"" + stopaddr + "\", \"address\": \"" + address + "\", \"pn12\": \"" + pn12 + "\", \"kanban\": \"" + kanban
                + "\", \"dolly\": \"" + dolly + "\", \"nbbox\": \"" + nbbox + "\", \"manifest\": \"" + manifest + "\", \"doneby\": \"" + doneby
                + "\", \"deliverydate\": \"" + deliverydate + "\", \"cycle\": \"" + cycle + "\", \"included\": \"" + included + "\", \"dockcode\": \""
                + dockcode + "\", \"suppliercode\": \"" + suppliercode + "\", \"deliverymethod\": \"" + deliverymethod + "\", \"ordergroup\": \""
                + ordergroup + "\", \"nbvalid\": \"" + nbvalid + "\", \"invoicenumber\": \"" + invoicenumber + "\", \"delmethroad\": \""
                + delmethroad + "\", \"highlighted\": \"" + highlighted + "\", \"orderlot\": \"" + orderlot + "\"}";
    }

}