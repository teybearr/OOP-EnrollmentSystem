package org.example.model;

import org.example.service.DepartmentRegistrationImpl;
import java.util.ArrayList;

public class DataInitz {
    public static void init(DepartmentRegistrationImpl DRegistration) {

        // cite
        Section IT1A = new Section("IT1A", 6);
        Section IT1B = new Section("IT1B", 7);
        Department CITEDep = new Department("CITE", "College of Info Tech and Engr", new ArrayList<>());
        CITEDep.getSectionList().add(IT1A);
        CITEDep.getSectionList().add(IT1B);

        // ceas
        Section E1A = new Section("E1A", 10);
        Section E1B = new Section("E1B", 5);
        Department CEASDep = new Department("CEAS", "College of Educ, Arts, and Sci", new ArrayList<>());
        CEASDep.getSectionList().add(E1A);
        CEASDep.getSectionList().add(E1B);

        // cithm
        Section Z1A = new Section("Z1A", 10);
        Section Z1B = new Section("Z1B", 5);
        Department CITHMDep = new Department("CITHM", "College of Int Tourism and Hospi Mngt", new ArrayList<>());
        CITHMDep.getSectionList().add(Z1A);
        CITHMDep.getSectionList().add(Z1B);

        // ---- FEED INTO REGISTRATION ----
        DRegistration.addDepartment(CITEDep);
        DRegistration.addDepartment(CEASDep);
        DRegistration.addDepartment(CITHMDep);
    }
}
