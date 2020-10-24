package com.nci.admin.model;


import java.util.List;

/**
 * Created by Richard on 9/21/17.
 */
public class LoanIdParam {

    /**
     * Loan id list.
     */
    private List<String> loanIdList;


    public List<String> getLoanIdList() {
        return loanIdList;
    }

    public void setLoanIdList(final String loanIdList) {
        for (String str: loanIdList.split(",")) {
            this.loanIdList.add(str);
        }
    }
}
