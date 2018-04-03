package Lesson9.utils;

/**
 * Created by Ruslan on 14.03.2018.
 */
public class Checker {
    //private
    //default (package-private)
    //protected
    //public



    public int companyNamesValidatedCount = 0;

    public boolean checkCompanyName (String companyName) {
        /*if (companyName == "Google" || companyName == "Amazon")
            return false;
        return true;*/
        companyNamesValidatedCount++;
        return companyName != "Google" && companyName != "Amazon";

    }




}
