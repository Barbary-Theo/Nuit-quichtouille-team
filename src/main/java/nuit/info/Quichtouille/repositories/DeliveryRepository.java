package nuit.info.Quichtouille.repositories;

import nuit.info.quichtouille.model.Delivery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.Param;

import javax.transaction.*;
import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;


@Transactional
public interface DeliveryRepository extends CrudRepository<Delivery, Long> {

//    //Find delivery
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest=:manifest and d.deliverymethod=:deliverymethod and d.address=:address and d.kanban=:kanban")
//    public List<Delivery> findDeliveryByRoadAndCycleAndManifestAndDeliverymethodAndAddressAndKanban(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest, @Param("deliverymethod") String deliverymethod, @Param("address") String address, @Param("kanban") String kanban);
//
//    //Find ack transfer and delivery
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest=:manifest and d.kanban like %:kanban% order by d.deliverystop")
//    public List<Delivery> findAckTransferAndDelivery(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest, @Param("kanban") String kanban);
//
//    //All deliveries
//    @Query("select d from Delivery d where d.road=:road and d.included='N'")
//    public List<Delivery> findDeliveryByRoad(@Param("road") String road, Pageable page);

//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.included='N'")
//    public List<Delivery> findDeliveryByRoadAndCycle(@Param("road") String road, @Param("cycle") String cycle,Pageable page);
//
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.included='N'")
//    public List<Delivery> findDeliveryByRoadAndCycleAndDate(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest,Pageable page);
//
//    //FIND delivery matching pick
//    @Query("SELECT d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.kanban=:kanban and d.deliverymethod='DELI' and d.address = :address")
//    public List<Delivery> findDeliveryMacthingPick(@Param("road")String road, @Param("cycle") Integer cycle, @Param("manifest")String manifest, @Param("kanban")String kanban, @Param("address")String address);
//
//    //FIND pick matching delivery
//    @Query("SELECT d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.kanban=:kanban and d.deliverymethod='PICK'")
//    public List<Delivery> findPickMacthingDelivery(@Param("road")String road, @Param("cycle") Integer cycle, @Param("manifest")String manifest, @Param("kanban")String kanban);
//
//    //All deliveries after a particular date
//
//    @Query("select d from Delivery d where d.road=:road and d.deliverydate>:datefrom and d.included!='N'")
//    public List<Delivery> findDeliveryByRoad(@Param("road") String road,@Param("datefrom") Date datefrom,Pageable page);
//
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.deliverydate>:datefrom and d.included!='N'")
//    public List<Delivery> findDeliveryByRoadAndCycle(@Param("road") String road, @Param("cycle") String cycle,@Param("datefrom") Date datefrom,Pageable page);
//
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.deliverydate>:datefrom and d.included!='N'")
//    public List<Delivery> findDeliveryByRoadAndCycleAndDate(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest,@Param("datefrom") Date datefrom,Pageable page);
//
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.included!='N'")
//    public List<Delivery> findAllDeliveryByRoadAndCycleAndDate(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest, Pageable page);
//
//    //Deliveries not yet completed
//
//    @Query("select d from Delivery d where d.doneby is null and d.included!='N' order by d.manifest,d.road,d.cycle,d.deliverystop,d.kanban")
//    public List<Delivery> findDeliveryToDo(Pageable page);
//
//    @Query("select d from Delivery d where d.road=:road and d.doneby is null and d.included!='N' order by d.manifest,d.road,d.cycle,d.deliverystop,d.kanban")
//    public List<Delivery> findDeliveryToDoByRoad(@Param("road") String road,Pageable page);
//
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.doneby is null and d.included!='N' order by d.manifest,d.road,d.cycle,d.deliverystop,d.kanban")
//    public List<Delivery> findDeliveryToDoByRoadAndCycle(@Param("road") String road, @Param("cycle") String cycle,Pageable page);
//
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.doneby is null and d.included!='N' order by d.manifest,d.road,d.cycle,d.deliverystop,d.kanban")
//    public List<Delivery> findDeliveryToDoByRoadAndCycleAndDate(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest,Pageable page);
//
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.doneby is null and d.included!='N' and (d.nbbox = 0 or d.nbbox > d.nbvalid) order by d.manifest,d.road,d.cycle,d.deliverystop,d.kanban")
//    public List<Delivery> findDeliveryToDoByRoadAndCycleAndDateAndNbvalid(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest,Pageable page);
//
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.doneby is null and d.included!='N' and d.nbbox > d.nbvalid and :start <= d.deliverystop and d.deliverystop <= :end order by d.manifest,d.road,d.cycle,d.deliverystop,d.kanban")
//    public List<Delivery> findPickToDoByRoadAndCycleAndDateInRange(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest, @Param("start") Integer startPick, @Param("end") Integer endPick,Pageable page);
//
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.doneby is null and d.included!='N' and d.nbbox > d.nbvalid and (:start > d.deliverystop or d.deliverystop > :end) order by d.manifest,d.road,d.cycle,d.deliverystop,d.kanban")
//    public List<Delivery> findDeliveryToDoByRoadAndCycleAndDateInRange(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest, @Param("start") Integer startPick, @Param("end") Integer endPick,Pageable page);
//
//    // research deliveries by kanban
//    @Query("select d from Delivery d where d.kanban = :kanban and d.road in (:roads) and d.deliverymethod != 'PICK' order by d.manifest, d.cycle, d.planneddelseq")
//    public List<Delivery> searchDeliveriesByKanban(@Param("kanban") String kanban, @Param("roads") List<String> road);
//
//    @Query("select d from Delivery d where d.road like :road% and kanban like %:kanban% and d.cycle=:cycle and d.manifest like :manifest% and d.doneby is null and d.included!='N' order by d.manifest desc,d.cycle desc,d.road asc,d.deliverystop asc,d.kanban asc")
//    public List<Delivery> searchEngineTodoDeliveries(@Param("road") String road, @Param("cycle") Integer cycle, @Param("kanban") String kanban, @Param("manifest") String manifest,Pageable page);
//
//    @Query("select d from Delivery d where d.road like :road% and kanban like %:kanban% and d.manifest like :manifest% and d.doneby is null and d.included!='N' order by d.manifest desc,d.cycle desc,d.road asc,d.deliverystop asc,d.kanban asc")
//    public List<Delivery> searchEngineTodoDeliveriesAllCycles(@Param("road") String road,@Param("kanban") String kanban, @Param("manifest") String manifest,Pageable page);
//
//    @Query("select d from Delivery d where d.road like :road% and kanban like %:kanban% and d.cycle=:cycle and d.manifest like :manifest% and d.doneby is not null and d.deliverydate is not null and d.included!='N' order by d.manifest desc,d.cycle desc,d.road asc,d.deliverystop asc,d.kanban asc")
//    public List<Delivery> searchEngineCompletedDeliveries(@Param("road") String road, @Param("cycle") Integer cycle, @Param("kanban") String kanban, @Param("manifest") String manifest,Pageable page);
//
//    @Query("select d from Delivery d where d.road like :road% and kanban like %:kanban% and d.manifest like :manifest% and d.doneby is not null and d.deliverydate is not null and d.included!='N' order by d.manifest desc,d.cycle desc,d.road asc,d.deliverystop asc,d.kanban asc")
//    public List<Delivery> searchEngineCompletedDeliveriesAllCycles(@Param("road") String road, @Param("kanban") String kanban, @Param("manifest") String manifest,Pageable page);
//
//    //Findall completed deliveries after a particular date
//    @Query("select d from Delivery d where d.deliverydate>:datefrom")
//    public List<Delivery> findAllCompletedDeliveriesAfterDate(@Param("datefrom") Date datefrom,Pageable page);
//
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.doneby is not null and d.deliverydate is not null and d.included!='N' order by d.manifest,d.road,d.cycle,d.deliverystop,d.kanban asc")
//    public List<Delivery> findCompletedDeliveryByRoadAndCycleAndDate(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest,Pageable page);
//
//    //Deliveries completed by a predefined user
//    @Query("select d from Delivery d where d.doneby=:doneby and d.included!='N'")
//    public List<Delivery> findDeliveryDoneByUsername(@Param("doneby") String doneby,Pageable page);
//
//    //Deliveries completed by a predefined user after a particular date
//    @Query("select d from Delivery d where d.doneby=:doneby and d.deliverydate>:datefrom and d.included!='N'")
//    public List<Delivery> findDeliveryDoneByUsername(@Param("doneby") String doneby,@Param("datefrom") Date datefrom,Pageable page);
//
//    // Used to acknowledge delivery steps
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and (d.stopaddr=:stopaddr or d.deliverystop=:deliverystop) and d.doneby is null and d.included!='N' order by d.manifest,d.road,d.cycle,d.deliverystop,d.kanban")
//    public List<Delivery> findDeliveryToDoByRoadAndCycleAndDateAndStopAddressOrDeliverystop(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest,@Param("stopaddr") String stopaddr, @Param("deliverystop") Integer deliverystop, Pageable page);
//
//    // Used find start delivery
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.deliverystop=:deliverystop order by d.manifest,d.road,d.cycle,d.deliverystop,d.kanban")
//    public List<Delivery> findDeliveryByRoadAndCycleAndManifestAndDeliverystop(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest, @Param("deliverystop") Integer deliverystop, Pageable page);
//
//    //Used to find next cycle and date for a particular road by the last validation
//    @Query("select d from Delivery d where d.road=:road and d.doneby is not null and d.deliverydate is not null and d.included!='N' order by d.deliverydate desc")
//    public List<Delivery> findNextDeliveriesByRoadLastValidation(@Param("road") String road,Pageable page);
//
//    //Used to find next cycle and date for a particular road by the first null validation
//    @Query("select d from Delivery d where d.road=:road and d.doneby is null and d.deliverydate is null and d.included!='N' order by d.manifest,d.cycle,d.deliverystop,d.kanban")
//    public List<Delivery> findNextDeliveriesByRoadFirstNull(@Param("road") String road,Pageable page);
//
//    //Used to find next cycle and date for a particular road and manifest
//    @Query("select d from Delivery d where d.road=:road and d.manifest>:manifest and d.doneby is null and d.deliverydate is null and d.included!='N' order by d.manifest,d.cycle,d.deliverystop,d.kanban")
//    public List<Delivery> findNextDeliveriesByRoadAndManifest(@Param("road") String road,@Param("manifest") String manifest,Pageable page);
//
//    //Used to find next cycle and date for a particular road
//    @Query("select d from Delivery d where d.road=:road and ((d.manifest=:manifest and d.cycle>=:cycle) or d.manifest>:manifest) and d.deliverystop=0 and d.included!='N' order by d.manifest,d.cycle,d.deliverystop,d.kanban")
//    public List<Delivery> findNextTourStart(@Param("road") String road,@Param("manifest") String manifest,@Param("cycle") Integer cycle,Pageable page);
//
//    //Used to find the true address of a transfer
//    @Query("select d.address from Delivery d where d.kanban=:kanban and d.manifest=:manifest and road=:road")
//    public List<String> findAddressOfTransfer(@Param("kanban") String kanban, @Param("road") String road, @Param("manifest") String manifest);
//
//    //Used to find a list a deliveries (by road, cycle, manifest) to know advance delay by address
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.included != 'N' order by d.deliverystop,d.kanban")
//    public List<Delivery> findDeliveryByRoadAndCycleAndDateWithoutIncluded(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest,Pageable page);
//
//    @Query("select d from Delivery d where d.road=:road and d.cycle=:cycle and d.manifest like :manifest% and d.included != 'N' and d.deliverymethod != 'PICK' order by d.deliverystop,d.kanban")
//    //Used to find a list a deliveries (by road, cycle, manifest) to know advance delay by address without pick
//    public List<Delivery> findDeliveryByRoadAndCycleAndDateWithoutIncludedPick(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest,Pageable page);
//
//    //Used to find all manifest and cycle
//    //@Query("select d from Delivery d where d.road = :road and address = 'Départ' order by manifest, cycle")
//    //public List<Delivery> findAllManifestWithCycle(@Param("road") String road, Pageable page);
//
//    //@Query(value="select manifest, cycle from Delivery d where address = 'Départ' group by manifest, cycle order by manifest, cycle \n-- #pageable\n",
//    //		countQuery = "select count(*) from Delivery d where address = 'Départ' group by manifest, cycle",
//    //		nativeQuery=true)
//    @Query(value="select manifest, cycle from Delivery d group by manifest, cycle order by manifest desc, cycle desc \n-- #pageable\n",
//            countQuery = "select count(*) from Delivery d group by manifest, cycle order by manifest desc, cycle desc",
//            nativeQuery=true)
//    public List<Object[]> findAllManifestWithCycle(Pageable page);
//
//    //Used to find all manifest
//    //@Query("select manifest from Delivery d where d.road = :road and address = 'Départ' and cycle = 1 order by manifest")
//    @Query("select manifest from Delivery d where d.road = :road group by d.manifest order by d.manifest")
//    public List<String> findAllManifestByRoad(@Param("road") String road, Pageable page);
//
//    @Query("select manifest from Delivery d group by d.manifest order by d.manifest")
//    public List<String> findAllManifest(Pageable page);
//
//    @Query("select d from Delivery d where d.road =:road and d.address =:address and d.pn12=:pn12 and ((:datefrom = d.manifest and :cyclefrom <= d.cycle) or :datefrom < d.manifest) and ((d.manifest = :dateto and d.cycle <= :cycleto) or d.manifest < :dateto)")
//    public List<Delivery> findDeliveryByPn12RoadAddressBetweenManifestCycle(@Param("pn12") String pn12, @Param("road") String road, @Param("address") String address, @Param("datefrom") String datefrom, @Param("cyclefrom") int cyclefrom, @Param("dateto") String dateto, @Param("cycleto") int cyleto);
//
//    @Query("select d from Delivery d where d.road =:road and d.address =:address and d.pn12=:pn12 and d.manifest >= :from and d.manifest <= :to")
//    public List<Delivery> findDeliveryByPn12RoadAddressBetweenManifest(@Param("pn12") String pn12, @Param("road") String road, @Param("address") String address, @Param("from") String from, @Param("to") String to);
//
//    @Query("select d from Delivery d where d.road =:road and d.address =:address and d.pn12=:pn12")
//    public List<Delivery> findDeliveryByPn12RoadAddress(@Param("pn12") String pn12, @Param("road") String road, @Param("address") String address);
//
//    // Used to find a kanban by pn
//    @Query(value = "select top(1) d.kanban from Delivery d where d.pn12=:pn12 group by d.kanban", nativeQuery = true)
//    public String findKanbanByPn12(@Param("pn12") String pn12);
//
//    // Used to find a pn by kanban
//    @Query(value = "select top(1) d.pn12 from Delivery d where d.kanban=:kanban group by d.pn12", nativeQuery = true)
//    public String findPn12ByKanban(@Param("kanban") String kanban);
//
//    @Query(value = "select d from Delivery d where d.invoicenumber=:invoicenumber and d.pn12=:pn12")
//    public List<Delivery> findKanbanByInvoiceAndPn12(@Param("invoicenumber") String invoicenumber, @Param("pn12") String pn12);
//
//    @Query(value = "select max(cycle) from Delivery where road = :road and manifest = :manifest group by road, manifest", nativeQuery = true)
//    public Integer findCycleNumberByManifestAndRoad(@Param("road") String Road, @Param("manifest") String manifest);
//
//    @Query(value = "select max(cycle) from Delivery where road = :road group by road", nativeQuery = true)
//    public Integer findMaxCycleNumberByRoad(@Param("road") String road);
//
//    @Modifying
//    @Query(value = "update DELIVERY set highlighted = :highlighted where kanban = :kanban", nativeQuery=true)
//    public void updateHighlightedpartDeliveriesByKanban(@Param("kanban") String kanban, @Param("highlighted") String highlighted);
//
//    //FIND KANBAN TO PICK FOR MANIFEST, CYCLE AND ROAD
//    @Query("SELECT count(d) FROM Delivery d WHERE d.manifest = :manifest and d.cycle=:cycle and d.road=:road and d.deliverymethod='PICK' and d.doneby IS NULL")
//    Integer findKanbanToPickByManifestAndCycleAndRoad(@Param("manifest") String manifest, @Param("road") String road,@Param("cycle") int cycle);
//
//    // Internal kanban
//    @Query("select d from Delivery d where d.road like :road% and d.cycle=:cycle and d.manifest like :manifest% and d.deliverystop >= :start and d.deliverystop <= :end order by d.manifest desc,d.cycle desc,d.road asc,d.deliverystop asc")
//    public List<Delivery> searchPickingInstruction(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest, @Param("start") Integer startPickingDeliveryStop, @Param("end") Integer endPickingDeliveryStop, Pageable page);
}