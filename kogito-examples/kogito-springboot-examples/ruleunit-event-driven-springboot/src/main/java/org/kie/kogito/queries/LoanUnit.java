/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito.queries;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

public class LoanUnit implements RuleUnitData {

    private int maxAmount;

    private DataStore<LoanApplication> loanApplications;
    private DataStore<AllAmounts> allAmounts;

    public LoanUnit() {
        this(DataSource.createStore(), DataSource.createStore());
    }

    public LoanUnit(DataStore<LoanApplication> loanApplications, DataStore<AllAmounts> allAmounts) {
        this.loanApplications = loanApplications;
        this.allAmounts = allAmounts;
    }

    public DataStore<LoanApplication> getLoanApplications() {
        return loanApplications;
    }

    public void setLoanApplications(DataStore<LoanApplication> loanApplications) {
        this.loanApplications = loanApplications;
    }

    public DataStore<AllAmounts> getAllAmounts() {
        return allAmounts;
    }

    public void setAllAmounts(DataStore<AllAmounts> allAmounts) {
        this.allAmounts = allAmounts;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

}
