package com.spellguess;

public class SpellWord {
    String[] category={"Relation","Job","Animals","Birds"};
    String[][] spellwords={ {"AGREE_ENT","CON_RUITY","BON_","LIN_"},
        {"PR_FESSION","C_REER","SER_ICE","_UTY"},
            {"CAR_IVORE","HERBI_ORE","INSE_TIVORE","P_T"},
           {"CO_K","_STRICH","PART_IDGE","B_T"}};

//            Categories word with no blank with corresponding category
//            {"AGREEMENT","CONGRUITY","BOND","LINK"},
//            {"PROFESSION","CAREER","SERVICE","DUTY"},
//            {"CARNIVORE","HERBIVORE","INSECTIVORE","PET"},
//            {"COCK","OSTRICH","PARTRIDGE","BAT"}};
    String[] answer={"MGDK","OAVD","NVCE","CORA"};


    public String getcategory(int pos)
    {
        String icategory =category[pos];
        return icategory;
    }
    public String getspellword1(int pos)
    {
        String iword1 =spellwords[pos][0];
        return iword1;
    }
    public String getspellword2(int pos)
    {
        String iword2 =spellwords[pos][1];
        return iword2;
    }
    public String getspellword3(int pos)
    {
        String iword3 =spellwords[pos][2];
        return iword3;
    }
    public String getspellword4(int pos)
    {
        String iword4 =spellwords[pos][3];
        return iword4;
    }
    public String getans(int pos)
    {
        String ans = answer[pos];
        return ans;
    }
}
