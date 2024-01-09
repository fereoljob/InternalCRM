package univ.angers.fr.internalcrm.service;

import java.time.LocalDateTime;

import univ.angers.fr.internalcrm.domain.ModelTO;

public class Mapper {
    public static ModelTO fromInternalLeadDtoToModelTo(InternalLeadDto obj){
        String[] tab = obj.getName().split(",");
        ModelTO lead = new ModelTO(tab[0],tab[1], obj.getAnnualRevenue(),
        obj.getPhone(), obj.getStreet(),obj.getPostalCode(),obj.getCity(), obj.getCountry(),
         LocalDateTime.parse(obj.getCreationDate()),obj.getCompany(),obj.getState());
        return lead;
    }
    public static InternalLeadDto fromModelTOTOInternalLeadDto(ModelTO obj){
        InternalLeadDto lead = new InternalLeadDto(obj.getFirstName()+","+ obj.getLastName(), obj.getAnnualRevenue(),
        obj.getPhone(), obj.getStreet(),obj.getPostalCode(),obj.getCity(), obj.getCountry(),
         obj.getCreationDate().toString(),obj.getCompany(),obj.getState());
         return lead;
    }
}
