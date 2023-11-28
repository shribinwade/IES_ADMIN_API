package in.ies.service;

import in.ies.bindings.PlanForm;



import java.util.List;

public interface PlanService {


    public boolean createPlan(PlanForm planForm);

    public List<PlanForm> fetchPlanForm();

    public PlanForm getPlanById(Integer planId);

    public String changePlanStatus(Integer planId,String status);


}
