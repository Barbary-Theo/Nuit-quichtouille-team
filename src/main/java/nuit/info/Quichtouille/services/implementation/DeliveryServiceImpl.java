package nuit.info.Quichtouille.services.implementation;

import nuit.info.Quichtouille.model.Delivery;
import nuit.info.Quichtouille.repositories.DeliveryRepository;
import nuit.info.Quichtouille.services.DeliveryService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/*
 * Implementation of UserService
 */
@Component
@Transactional
public class DeliveryServiceImpl implements DeliveryService {

    @Resource
    private DeliveryRepository deliveryRepository;

    //Repository Getters / Setters
    public DeliveryRepository getDeliveryRepository() {
        return deliveryRepository;
    }

    public void setDeliveryRepository(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @Override
    public Delivery findById(Long id) {
        return null;
    }

    @Override
    public List<Delivery> findAll() {
        return null;
    }

    @Override
    public Delivery save(Delivery entity) {
        return null;
    }

    @Override
    public Delivery update(Delivery entity) {
        return null;
    }

    @Override
    public Iterable<Delivery> updateAll(Iterable<Delivery> entity) {
        return null;
    }

    @Override
    public Delivery create(Delivery entity) {
        return null;
    }

    @Override
    public Iterable<Delivery> createAll(List<Delivery> deliveries) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void deleteAll(List<Delivery> deliveries) {

    }

    @Override
    public List<Delivery> findAllDeliveryByRoadAndCycleAndDate(String road, Integer cycle, String manifest, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryByRoad(String road, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryByRoadAndCycle(String road, String cycle, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryByRoadAndCycleAndDate(String road, Integer cycle, String manifest, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryByRoadAndCycleAndDateWithoutIncluded(String road, Integer cycle, String manifest, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryByRoadAndCycleAndDateWithoutIncludedPick(String road, Integer cycle, String manifest, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryByRoad(String road, Date datefrom, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryByRoadAndCycle(String road, String cycle, Date datefrom, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryByRoadAndCycleAndDate(String road, Integer cycle, String manifest, Date datefrom, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryToDo(int maxResults) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryToDoByRoad(String road, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryToDoByRoadAndCycle(String road, String cycle, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryToDoByRoadAndCycleAndDate(String road, Integer cycle, String manifest, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryToDoByRoadAndCycleAndDateAndNbvalid(String road, Integer cycle, String manifest, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findPickToDoByRoadAndCycleAndDateInRange(String road, Integer cycle, String manifest, Integer startPick, Integer endPick, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryToDoByRoadAndCycleAndDateInRange(String road, Integer cycle, String manifest, Integer startPick, Integer endPick, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryToDoByRoadAndCycleAndDateAndStopAddressOrDeliverystop(String road, Integer cycle, String manifest, String stopaddr, Integer deliverystop, Pageable page) {
        return null;
    }

    @Override
    public Delivery findDeliveryByRoadAndCycleAndManifestAndDeliverystop(String road, Integer cycle, String manifest, Integer deliverystop) {
        return null;
    }

    @Override
    public List<Delivery> searchEngineTodoDeliveries(String road, Integer cycle, String kanban, String manifest, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> searchEngineTodoDeliveriesAllCycles(String road, String kanban, String manifest, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> searchDeliveriesByKanban(String kanban, List<String> roads) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryDoneByUsername(String doneby, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryDoneByUsername(String doneby, Date datefrom, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findAllCompletedDeliveriesAfterDate(Date datefrom, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findCompletedDeliveryByRoadAndCycleAndDate(String road, Integer cycle, String manifest, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> searchEngineCompletedDeliveries(String road, Integer cycle, String kanban, String manifest, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> searchEngineCompletedDeliveriesAllCycles(String road, String kanban, String manifest, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findNextDeliveriesByRoad(String road, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findNextDeliveriesByRoadAndManifest(String road, String manifest, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findNextTourStart(String road, String manifest, Integer cycle, Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryByRoadAndCycleAndManifestAndDeliverymethodAndAddressAndKanban(String road, Integer cycle, String manifest, String deliverymethod, String address, String kanban) {
        return null;
    }

    @Override
    public List<Delivery> findAckTransferAndDelivery(String road, Integer cycle, String manifest, String kanban) {
        return null;
    }

    @Override
    public List<String> findAddressOfTransfer(String kanban, String road, String manifest) {
        return null;
    }

    @Override
    public List<String> findAllManifestWithCycle(Pageable page) {
        return null;
    }

    @Override
    public List<String> findAllManifestByRoad(String road, Pageable page) {
        return null;
    }

    @Override
    public List<String> findAllManifest(Pageable page) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryByPn12RoadAddressBetweenManifestCycle(String pn12, String road, String address, String datefrom, int cyclefrom, String dateto, int cyleto) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryByPn12RoadAddressBetweenManifest(String pn12, String road, String address, String datefrom, String dateto) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryByPn12RoadAddress(String pn12, String road, String address) {
        return null;
    }

    @Override
    public String findKanbanByPn12(String pn12) {
        return null;
    }

    @Override
    public String findPn12ByKanban(String kanban) {
        return null;
    }

    @Override
    public Delivery findKanbanByInvoiceAndPn12(String invoice, String pn12) {
        return null;
    }

    @Override
    public Integer findCycleNumberByManifestAndRoad(String Road, String manifest) {
        return null;
    }

    @Override
    public Integer findMaxCycleNumberByRoad(String road) {
        return null;
    }

    @Override
    public void updateHighlightedpartDeliveriesByKanban(String kanban, String highlighted) {

    }

    @Override
    public Integer findKanbanToPickByManifestAndCycleAndRoad(String manifest, String road, int cycle) {
        return null;
    }

    @Override
    public List<Delivery> findDeliveryMacthingPick(String road, Integer cycle, String manifest, String kanban, String address) {
        return null;
    }

    @Override
    public List<Delivery> findPickMacthingDelivery(String road, Integer cycle, String manifest, String kanban) {
        return null;
    }

    @Override
    public List<Delivery> searchPickingInstruction(String road, Integer cycle, String manifest, Integer startPickingDeliveryStop, Integer endPickingDeliveryStop, Pageable page) {
        return null;
    }

//
//    //Usual CRUD services
//    @Override
//    public Delivery findById(Long id) {
//        Delivery delivery = deliveryRepository.findOne(id);
//        return delivery;
//    }
//
//    @Override
//    public List<Delivery> findAll() {
//        Iterable<Delivery> entities = deliveryRepository.findAll();
//        List<Delivery> beans = new ArrayList<Delivery>();
//        for(Delivery delivery : entities) {
//            beans.add(delivery);
//        }
//        return beans;
//    }
//
//    @Override
//    public Delivery save(Delivery entity) {
//        return null;
//    }
//
//
//    @Override
//    public Delivery create(Delivery delivery) {
//        Delivery deliverySaved = deliveryRepository.save(delivery);
//        return deliverySaved;
//    }
//
//    @Override
//    public Iterable<Delivery> createAll(List<Delivery> deliveries) {
//        Iterable<Delivery> deliveriesSaved = deliveryRepository.save(deliveries);
//        return deliveriesSaved;
//    }
//
//
//    @Override
//    public Delivery update(Delivery delivery) {
//        Delivery deliverySaved = deliveryRepository.save(delivery);
//        return deliverySaved;
//    }
//
//    @Override
//    public Iterable<Delivery> updateAll(Iterable<Delivery> entity) {
//        return deliveryRepository.save(entity);
//    }
//
//    @Override
//    public void delete(Long id) {
//        deliveryRepository.delete(id);
//    }
//
//    @Override
//    public void deleteAll(List<Delivery> deliveries) {
//        deliveryRepository.delete(deliveries);
//    }
//
//    //All deliveries
//    @Override
//    public List<Delivery> findDeliveryByRoad(String road,Pageable page) {
//        return findDeliveryByRoad(road,null, page);
//    }
//
//    @Override
//    public List<Delivery> findDeliveryByRoadAndCycle(String road, String cycle,Pageable page) {
//        return findDeliveryByRoadAndCycle(road,cycle,null,page);
//    }
//
//    @Override
//    public List<Delivery> findDeliveryByRoadAndCycleAndDate(String road, Integer cycle,String manifest,Pageable page) {
//        return findDeliveryByRoadAndCycleAndDate(road,cycle,manifest,null, page);
//    }
//
//    //All deliveries after a particular date
//
//    @Override
//    public List<Delivery> findAllDeliveryByRoadAndCycleAndDate(String road, Integer cycle, String manifest,Pageable page){
//        return deliveryRepository.findAllDeliveryByRoadAndCycleAndDate(road, cycle, manifest, page);
//    }
//
//    @Override
//    public List<Delivery> findDeliveryByRoad(String road, Date datefrom,Pageable page) {
//        if (datefrom!=null){
//            return deliveryRepository.findDeliveryByRoad(road,datefrom,page);
//        }
//        else{
//            return deliveryRepository.findDeliveryByRoad(road,page);
//        }
//    }
//
//    @Override
//    public List<Delivery> findDeliveryByRoadAndCycle(String road, String cycle, Date datefrom,Pageable page) {
//        if (datefrom!=null){
//            return deliveryRepository.findDeliveryByRoadAndCycle(road, cycle, datefrom, page);
//        }
//        else{
//            return deliveryRepository.findDeliveryByRoadAndCycle(road, cycle, page);
//        }
//    }
//
//    @Override
//    public List<Delivery> findDeliveryByRoadAndCycleAndDate(String road, Integer cycle, String manifest, Date datefrom,Pageable page) {
//        if (datefrom!=null){
//            return deliveryRepository.findDeliveryByRoadAndCycleAndDate(road, cycle, manifest, datefrom, page);
//        }
//        else{
//            return deliveryRepository.findDeliveryByRoadAndCycleAndDate(road, cycle, manifest, page);
//        }
//    }
//
//    //Deliveries not yet completed
//
//    @Override
//    public List<Delivery> findDeliveryToDo(int maxResults) {
//        Pageable p = new PageRequest(0,maxResults);
//        return deliveryRepository.findDeliveryToDo(p);
//    }
//
//    @Override
//    public List<Delivery> findDeliveryToDoByRoad(String road,Pageable page) {
//        return deliveryRepository.findDeliveryToDoByRoad(road, page);
//    }
//
//    @Override
//    public List<Delivery> findDeliveryToDoByRoadAndCycle(String road, String cycle,Pageable page) {
//        return deliveryRepository.findDeliveryToDoByRoadAndCycle(road,cycle,page);
//    }
//
//    @Override
//    public List<Delivery> findDeliveryToDoByRoadAndCycleAndDate(String road, Integer cycle, String manifest,Pageable page) {
//        return deliveryRepository.findDeliveryToDoByRoadAndCycleAndDate(road,cycle,manifest, page);
//    }
//
//    @Override
//    public List<Delivery> findAllCompletedDeliveriesAfterDate(Date datefrom,Pageable page) {
//        return deliveryRepository.findAllCompletedDeliveriesAfterDate(datefrom, page);
//    }
//
//    //Deliveries completed by a predefined user
//    @Override
//    public List<Delivery> findDeliveryDoneByUsername(String doneby,Pageable page) {
//        return findDeliveryDoneByUsername(doneby,null,page);
//    }
//
//    //Deliveries completed by a predefined user after a particular date
//    @Override
//    public List<Delivery> findDeliveryDoneByUsername(String doneby,Date datefrom,Pageable page) {
//        if (datefrom!=null){
//            return deliveryRepository.findDeliveryDoneByUsername(doneby, datefrom, page);
//        }
//        else{
//            return deliveryRepository.findDeliveryDoneByUsername(doneby, page);
//        }
//    }
//
//    @Override
//    public List<Delivery> findCompletedDeliveryByRoadAndCycleAndDate(String road, Integer cycle, String manifest,Pageable page){
//        return deliveryRepository.findCompletedDeliveryByRoadAndCycleAndDate(road,cycle,manifest,page);
//    }
//
//    @Override
//    public List<Delivery> findDeliveryToDoByRoadAndCycleAndDateAndStopAddressOrDeliverystop(String road, Integer cycle, String manifest, String stopaddr, Integer deliverystop, Pageable page) {
//        return deliveryRepository.findDeliveryToDoByRoadAndCycleAndDateAndStopAddressOrDeliverystop(road,cycle,manifest,stopaddr, deliverystop, page);
//    }
//
//    @Override
//    public Delivery findDeliveryByRoadAndCycleAndManifestAndDeliverystop(String road, Integer cycle, String manifest, Integer deliverystop) {
//        return deliveryRepository.findDeliveryByRoadAndCycleAndManifestAndDeliverystop(road, cycle, manifest, deliverystop, new PageRequest(0, 1)).get(0);
//    }
//
//    @Override
//    public List<Delivery> findNextDeliveriesByRoad(String road,Pageable page) {
//        List<Delivery> deliveries = deliveryRepository.findNextDeliveriesByRoadLastValidation(road,page);
//        if (deliveries.size()>0){
//            return deliveries;
//        }else{
//            deliveries = deliveryRepository.findNextDeliveriesByRoadFirstNull(road,page);
//            if (deliveries.size()>0){
//                return deliveries;
//            }
//        }
//
//        // rare case
//        Delivery firtDelivery = new Delivery();
//        firtDelivery.setManifest(new SimpleDateFormat("yyyyMMdd").format(new Date()).toString());
//        return Arrays.asList(firtDelivery);
//    }
//
//    @Override
//    public List<Delivery> findNextDeliveriesByRoadAndManifest(String road, String manifest, Pageable page) {
//        return deliveryRepository.findNextDeliveriesByRoadAndManifest(road,manifest,page);
//
//    }
//
//    @Override
//    public List<Delivery> findNextTourStart(String road,String manifest,Integer cycle,Pageable page) {
//        return deliveryRepository.findNextTourStart(road,manifest,cycle,page);
//
//    }
//
//    @Override
//    public List<Delivery> searchEngineTodoDeliveries(String road, Integer cycle, String kanban, String manifest, Pageable page) {
//        if (kanban.equalsIgnoreCase("*")) kanban="";
//        return deliveryRepository.searchEngineTodoDeliveries( road,  cycle, kanban,  manifest,  page);
//    }
//
//    @Override
//    public List<Delivery> searchEngineCompletedDeliveries(String road, Integer cycle,String kanban,  String manifest, Pageable page) {
//        if (kanban.equalsIgnoreCase("*")) kanban="";
//        return deliveryRepository.searchEngineCompletedDeliveries( road,  cycle, kanban, manifest,  page);
//    }
//
//    @Override
//    public List<Delivery> searchEngineTodoDeliveriesAllCycles(String road, String kanban, String manifest, Pageable page) {
//        if (kanban.equalsIgnoreCase("*")) kanban="";
//        return deliveryRepository.searchEngineTodoDeliveriesAllCycles( road,  kanban, manifest,  page);
//    }
//
//    @Override
//    public List<Delivery> searchEngineCompletedDeliveriesAllCycles(String road, String kanban, String manifest, Pageable page) {
//        if (kanban.equalsIgnoreCase("*")) kanban="";
//        return deliveryRepository.searchEngineCompletedDeliveriesAllCycles( road, kanban, manifest,  page);
//    }
//
//    @Override
//    public List<String> findAddressOfTransfer(String kanban, String road, String manifest) {
//        return deliveryRepository.findAddressOfTransfer(kanban, road, manifest);
//    }
//
//    @Override
//    public List<Delivery> findDeliveryByRoadAndCycleAndDateWithoutIncluded(String road, Integer cycle, String manifest,
//                                                                           Pageable page) {
//        return deliveryRepository.findDeliveryByRoadAndCycleAndDateWithoutIncluded(road, cycle, manifest, page);
//    }
//
//    @Override
//    public List<Delivery> findDeliveryByRoadAndCycleAndDateWithoutIncludedPick(String road, Integer cycle,
//                                                                               String manifest, Pageable page) {
//        return deliveryRepository.findDeliveryByRoadAndCycleAndDateWithoutIncludedPick(road, cycle, manifest, page);
//    }
//
//	/*@Override
//	public List<String> findAllManifestWithCycle(String road, Pageable page){
//		List<String> res = new ArrayList<String>();
//		for(Delivery d : deliveryRepository.findAllManifestWithCycle(road, page)){
//			res.add("{\"manifest\":\""+d.getManifest()+"\", \"cycle\":"+d.getCycle()+"}");
//		}
//		return res;
//	}*/
//
//    public List<Delivery> findDeliveryByPn12RoadAddressBetweenManifest(String pn12, String road, String address, String from, String to){
//        return deliveryRepository.findDeliveryByPn12RoadAddressBetweenManifest(pn12, road, address, from, to);
//    }
//
//    @Override
//    public List<String> findAllManifest(Pageable page) {
//        return  deliveryRepository.findAllManifest(page);
//    }
//
//    @Override
//    public List<String> findAllManifestByRoad(String road, Pageable page) {
//        return  deliveryRepository.findAllManifestByRoad(road, page);
//    }
//
//    @Override
//    public List<Delivery> findPickToDoByRoadAndCycleAndDateInRange(String road, Integer cycle, String manifest,
//                                                                   Integer startPick, Integer endPick, Pageable page) {
//        return deliveryRepository.findPickToDoByRoadAndCycleAndDateInRange(road, cycle, manifest, startPick, endPick, page);
//    }
//
//    @Override
//    public List<Delivery> findDeliveryToDoByRoadAndCycleAndDateInRange(String road, Integer cycle, String manifest,
//                                                                       Integer startPick, Integer endPick, Pageable page) {
//        return deliveryRepository.findDeliveryToDoByRoadAndCycleAndDateInRange(road, cycle, manifest, startPick, endPick, page);
//    }
//
//    @Override
//    public List<Delivery> findDeliveryToDoByRoadAndCycleAndDateAndNbvalid(String road, Integer cycle, String manifest,
//                                                                          Pageable page) {
//        return deliveryRepository.findDeliveryToDoByRoadAndCycleAndDateAndNbvalid(road, cycle, manifest, page);
//    }
//
//    public List<Delivery> findDeliveryByPn12RoadAddress(String pn12, String road, String address){
//        return deliveryRepository.findDeliveryByPn12RoadAddress(pn12, road, address);
//    }
//
//    @Override
//    public List<Delivery> findDeliveryByPn12RoadAddressBetweenManifestCycle(String pn12, String road, String address,
//                                                                            String datefrom, int cyclefrom, String dateto, int cyleto) {
//        return deliveryRepository.findDeliveryByPn12RoadAddressBetweenManifestCycle(pn12, road, address, datefrom, cyclefrom, dateto, cyleto);
//    }
//
//    @Override
//    public String findKanbanByPn12(String pn12) {
//        return deliveryRepository.findKanbanByPn12(pn12);
//    }
//
//    @Override
//    public String findPn12ByKanban(String kanban) {
//        return deliveryRepository.findPn12ByKanban(kanban);
//    }
//
//    @Override
//    public Delivery findKanbanByInvoiceAndPn12(String invoice, String pn12) {
//        List<Delivery> list = deliveryRepository.findKanbanByInvoiceAndPn12(invoice, pn12);
//        return list != null && !list.isEmpty() ? list.get(0) : null;
//    }
//
//    @Override
//    public List<Delivery> findDeliveryByRoadAndCycleAndManifestAndDeliverymethodAndAddressAndKanban(String road,
//                                                                                                    Integer cycle, String manifest, String deliverymethod, String address, String kanban) {
//        return deliveryRepository.findDeliveryByRoadAndCycleAndManifestAndDeliverymethodAndAddressAndKanban(road, cycle, manifest, deliverymethod, address, kanban);
//    }
//
//    @Override
//    public List<Delivery> findAckTransferAndDelivery(String road, Integer cycle, String manifest, String kanban) {
//        return deliveryRepository.findAckTransferAndDelivery(road, cycle, manifest, kanban);
//    }
//
//    @Override
//    public void updateHighlightedpartDeliveriesByKanban(String kanban, String highlighted) {
//        deliveryRepository.updateHighlightedpartDeliveriesByKanban(kanban, highlighted);
//    }
//
//    @Override
//    public List<Delivery> searchDeliveriesByKanban(String kanban, List<String> roads) {
//        return deliveryRepository.searchDeliveriesByKanban(kanban, roads);
//    }
//
//    @Override
//    public Integer findCycleNumberByManifestAndRoad(String Road, String manifest) {
//        return deliveryRepository.findCycleNumberByManifestAndRoad(Road, manifest);
//    }
//
//    @Override
//    public Integer findMaxCycleNumberByRoad(String road) {
//        return deliveryRepository.findMaxCycleNumberByRoad(road);
//    }
//
//    @Override
//    public List<String> findAllManifestWithCycle(Pageable page) {
//        List<String> res = new ArrayList<String>();
//        for(Object[] d : deliveryRepository.findAllManifestWithCycle(page)){
//            res.add("{\"manifest\":\""+d[0]+"\", \"cycle\":"+d[1]+"}");
//        }
//        return res;
//    }
//
//    @Override
//    public Integer findKanbanToPickByManifestAndCycleAndRoad(String manifest, String road, int cycle) {
//        // TODO Auto-generated method stub
//        return deliveryRepository.findKanbanToPickByManifestAndCycleAndRoad(manifest, road, cycle);
//    }
//
//    //FIND delivery matching pick
//    @Override
//    public List<Delivery> findDeliveryMacthingPick(String road, Integer cycle, String manifest, String kanban,
//                                                   String address) {
//        return deliveryRepository.findDeliveryMacthingPick(road, cycle, manifest, kanban, address);
//    }
//
//    //FIND pick matching delivery
//    @Override
//    public List<Delivery> findPickMacthingDelivery(String road, Integer cycle, String manifest, String kanban) {
//        return deliveryRepository.findPickMacthingDelivery(road, cycle, manifest, kanban);
//    }
//
//    @Override
//    public List<Delivery> searchPickingInstruction(String road, Integer cycle, String manifest,
//                                                   Integer startPickingDeliveryStop, Integer endPickingDeliveryStop, Pageable page) {
//        return deliveryRepository.searchPickingInstruction(road, cycle, manifest, startPickingDeliveryStop, endPickingDeliveryStop, page);
//    }

}