package univ.angers.fr.internalcrm.service;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.thrift.TException;

import univ.angers.fr.internalcrm.repository.Repository;
import univ.angers.fr.internalcrm.repository.RepositoryImpl;

public class InternalCRMServiceImpl  implements InternalCRMService.Iface{
    private Repository repository;
    public InternalCRMServiceImpl(){
        this.repository = new RepositoryImpl();
    }
    @Override
    public List<InternalLeadDto> findLeads(double lowAnnualRevenue, double highAnnualRevenue, String state)
            throws TException {
        List<InternalLeadDto> listLead = repository.findAll().stream()
        .filter(element -> element.getAnnualRevenue() >= lowAnnualRevenue &&
        element.getAnnualRevenue() <= highAnnualRevenue && element.getState().equals(state))
        .map(element -> Mapper.fromModelTOTOInternalLeadDto(element))
        .toList();
        return listLead;
    }

    @Override
    public List<InternalLeadDto> findLeadsByDate(String startDate, String endDate) throws TException {
        LocalDateTime start = LocalDateTime.parse(startDate+"T00:00:00");
        LocalDateTime end = LocalDateTime.parse(endDate+"T23:59:59");
        List<InternalLeadDto> listLead = repository.findAll().stream()
        .filter(element -> element.getCreationDate().compareTo(start)>=0 &&
        element.getCreationDate().compareTo(end)<=0)
        .map(element -> Mapper.fromModelTOTOInternalLeadDto(element))
        .toList();
        return listLead;
    }

    @Override
    public void deleteLead(InternalLeadDto lead) throws TException {
       repository.deleteLead(Mapper.fromInternalLeadDtoToModelTo(lead));
    }

    @Override
    public void addLead(InternalLeadDto leadDto) throws TException {
        repository.addLead(Mapper.fromInternalLeadDtoToModelTo(leadDto));
    }
    
}
