package univ.angers.fr.internalcrm.service;

import univ.angers.fr.internalcrm.domain.ModelTO;

public class Mapper {
    public static ModelTO fromInternalLeadDtoToModelTo(InternalLeadDto obj){
        ModelTO lead = new ModelTO(obj.getFirstName(), obj.getLastName(), obj.getAnnualRevenue(),
        obj.getPhone(), obj.getStreet(),obj.getPostalCode(),obj.getCity(), obj.getCountry(),
         obj.getCreationDate(),obj.getCompany(),obj.getState());
        return lead;
    }
    public static InternalLeadDto fromModelTOTOInternalLeadDto(ModelTO obj){
        InternalLeadDto lead = new InternalLeadDto(obj.getFirstName(), obj.getLastName(), obj.getAnnualRevenue(),
        obj.getPhone(), obj.getStreet(),obj.getPostalCode(),obj.getCity(), obj.getCountry(),
         obj.getCreationDate(),obj.getCompany(),obj.getState());
         return lead;
    }
}
