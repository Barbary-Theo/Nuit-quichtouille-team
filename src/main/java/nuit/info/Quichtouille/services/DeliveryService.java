package nuit.info.quichtouille.services;

import nuit.info.quichtouille.model.Delivery;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface DeliveryService {

    //Usual CRUD services
    Delivery findById(Long id) ;
    List<Delivery> findAll();
    Delivery save(Delivery entity);
    Delivery update(Delivery entity);
    Iterable<Delivery> updateAll(Iterable<Delivery> entity);
    Delivery create(Delivery entity);
    Iterable<Delivery> createAll(List<Delivery> deliveries);
    void delete(Long id);
    void deleteAll(List<Delivery> deliveries);

    //All deliveries
    List<Delivery> findAllDeliveryByRoadAndCycleAndDate(String road, Integer cycle, String manifest,Pageable page);
    List<Delivery> findDeliveryByRoad(String road,Pageable page);
    List<Delivery> findDeliveryByRoadAndCycle(String road, String cycle,Pageable page);
    List<Delivery> findDeliveryByRoadAndCycleAndDate(String road, Integer cycle, String manifest,Pageable page);
    List<Delivery> findDeliveryByRoadAndCycleAndDateWithoutIncluded(String road, Integer cycle, String manifest,Pageable page);
    List<Delivery> findDeliveryByRoadAndCycleAndDateWithoutIncludedPick(String road, Integer cycle, String manifest,Pageable page);

    //All deliveries after a particular date
    List<Delivery> findDeliveryByRoad(String road, Date datefrom,Pageable page);
    List<Delivery> findDeliveryByRoadAndCycle(String road, String cycle,Date datefrom,Pageable page);
    List<Delivery> findDeliveryByRoadAndCycleAndDate(String road, Integer cycle, String manifest, Date datefrom,Pageable page);

    //Deliveries not yet completed
    List<Delivery> findDeliveryToDo(int maxResults);
    List<Delivery> findDeliveryToDoByRoad(String road,Pageable page);
    List<Delivery> findDeliveryToDoByRoadAndCycle(String road, String cycle,Pageable page);
    List<Delivery> findDeliveryToDoByRoadAndCycleAndDate(String road, Integer cycle, String manifest,Pageable page);
    List<Delivery> findDeliveryToDoByRoadAndCycleAndDateAndNbvalid(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest,Pageable page);
    List<Delivery> findPickToDoByRoadAndCycleAndDateInRange(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest, @Param("start") Integer startPick, @Param("end") Integer endPick,Pageable page);
    List<Delivery> findDeliveryToDoByRoadAndCycleAndDateInRange(@Param("road") String road, @Param("cycle") Integer cycle, @Param("manifest") String manifest, @Param("start") Integer startPick, @Param("end") Integer endPick,Pageable page);

    List<Delivery> findDeliveryToDoByRoadAndCycleAndDateAndStopAddressOrDeliverystop(String road, Integer cycle, String manifest, String stopaddr, Integer deliverystop, Pageable page);
    Delivery findDeliveryByRoadAndCycleAndManifestAndDeliverystop(String road, Integer cycle, String manifest, Integer deliverystop);
    List<Delivery> searchEngineTodoDeliveries(String road, Integer cycle, String kanban, String manifest,Pageable page);
    List<Delivery> searchEngineTodoDeliveriesAllCycles(String road, String kanban,  String manifest,Pageable page);
    List<Delivery> searchDeliveriesByKanban(String kanban, List<String> roads);

    //Deliveries completed
    List<Delivery> findDeliveryDoneByUsername(String doneby,Pageable page);
    List<Delivery> findDeliveryDoneByUsername(String doneby,Date datefrom,Pageable page);
    List<Delivery> findAllCompletedDeliveriesAfterDate(Date datefrom,Pageable page);
    List<Delivery> findCompletedDeliveryByRoadAndCycleAndDate(String road, Integer cycle, String manifest,Pageable page);
    List<Delivery> searchEngineCompletedDeliveries(String road, Integer cycle, String kanban, String manifest,Pageable page);
    List<Delivery> searchEngineCompletedDeliveriesAllCycles(String road, String kanban, String manifest,Pageable page);


    //Used to find next cycle and date for a particular road
    List<Delivery> findNextDeliveriesByRoad(String road,Pageable page);
    List<Delivery> findNextDeliveriesByRoadAndManifest(String road,String manifest,Pageable page);
    List<Delivery> findNextTourStart(String road,String manifest,Integer cycle,Pageable page);

    // Used in scan-in
    List<Delivery> findDeliveryByRoadAndCycleAndManifestAndDeliverymethodAndAddressAndKanban(String road, Integer cycle, String manifest, String deliverymethod, String address, String kanban);
    // Used to search transfer/ack transfer/delivery of a kanban by manifest/road/cycle
    List<Delivery> findAckTransferAndDelivery(String road, Integer cycle, String manifest, String kanban);

    //Used to find the true address of a transfer
    public List<String> findAddressOfTransfer(String kanban, String road, String manifest);

    //Used to find all manifest and cycle return Json array [{manifest,cycle},...]
    //public List<String> findAllManifestWithCycle(String road, Pageable page);
    public List<String> findAllManifestWithCycle(Pageable page);

    //Used to find all manifest
    public List<String> findAllManifestByRoad(String road, Pageable page);
    public List<String> findAllManifest(Pageable page);

    //Used to find a delivery to update
    public List<Delivery> findDeliveryByPn12RoadAddressBetweenManifestCycle(String pn12, String road, String address, String datefrom, int cyclefrom, String dateto, int cyleto);
    public List<Delivery> findDeliveryByPn12RoadAddressBetweenManifest(String pn12, String road, String address, String datefrom, String dateto);
    public List<Delivery> findDeliveryByPn12RoadAddress(String pn12, String road, String address);

    public String findKanbanByPn12(String pn12);
    public String findPn12ByKanban(String kanban);
    public Delivery findKanbanByInvoiceAndPn12(String invoice, String pn12);

    // find cycle number for a road at specific date
    public Integer findCycleNumberByManifestAndRoad(String Road, String manifest);
    // find max cycle number for a road
    public Integer findMaxCycleNumberByRoad(String road);

    public void updateHighlightedpartDeliveriesByKanban(String kanban, String highlighted);

    public Integer findKanbanToPickByManifestAndCycleAndRoad(String manifest, String road,int cycle);
    //FIND delivery matching pick
    public List<Delivery> findDeliveryMacthingPick(String road, Integer cycle, String manifest, String kanban, String address);
    //FIND pick matching delivery
    public List<Delivery> findPickMacthingDelivery(String road, Integer cycle, String manifest, String kanban);
    //PRINT KANBAN
    public List<Delivery> searchPickingInstruction(String road, Integer cycle, String manifest, Integer startPickingDeliveryStop, Integer endPickingDeliveryStop, Pageable page);
}