package univ.angers.fr.internalcrm.repository;

import java.util.List;

import org.instancio.Instancio;

import univ.angers.fr.internalcrm.domain.ModelTO;

public class RepositoryImpl implements Repository {
    private List<ModelTO> leadsList;

    public RepositoryImpl() {
        this.leadsList = Instancio.ofList(ModelTO.class).size(30).create();
        ModelTO mod = new ModelTO("haha", "haa", 1000, "", "2 avenue du général patton", "49100", "Angers", "France", "", "", "alabasta");
        leadsList.add(mod);    
    }


    @Override
    public List<ModelTO> findAll() {
        return leadsList;
    }

    @Override
    public void addLead(ModelTO obj) {
        this.leadsList.add(obj);
    }

    @Override
    public void deleteLead(ModelTO obj) {
        if (exists(obj)) {
            for (ModelTO element : leadsList) {
                if (obj.getFirstName().equals(element.getFirstName()) &&
                        obj.getLastName().equals(element.getLastName()) &&
                        obj.getPhone().equals(element.getPhone())) {
                    leadsList.remove(element);
                    break;
                }
            }
        }
    }

    @Override
    public boolean exists(ModelTO obj) {
        for (ModelTO element : leadsList) {
            if (obj.getFirstName().equals(element.getFirstName()) &&
                    obj.getLastName().equals(element.getLastName()) &&
                    obj.getPhone().equals(element.getPhone())) {
                return true;
            }
        }
        return false;
    }
}
