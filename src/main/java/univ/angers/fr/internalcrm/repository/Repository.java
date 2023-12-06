package univ.angers.fr.internalcrm.repository;

import java.util.List;

import univ.angers.fr.internalcrm.domain.ModelTO;

public interface Repository {

    List<ModelTO> findAll();

    void addLead(ModelTO obj);

    void deleteLead(ModelTO obj);

    boolean exists(ModelTO obj);

}