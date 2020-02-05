
package com.online.banking.Service;


        import com.online.banking.Entity.Action;
        import com.online.banking.Entity.CompteBancaire;
        import com.online.banking.Entity.Obligation;
        import com.online.banking.Repository.ActionRep;
        import com.online.banking.Repository.ObligationRep;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.ArrayList;
        import java.util.List;

@Service

public class ActionService {
    @Autowired
    private ActionRep actionRep;


    public List<Action> getallobligation() {
        List<Action> obligations = new ArrayList<>();
        actionRep.findAll().forEach(obligations::add);
        return obligations;
    }


}
