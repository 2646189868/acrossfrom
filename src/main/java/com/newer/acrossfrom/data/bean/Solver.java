package com.newer.acrossfrom.data.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Solver {
    private BigDecimal solverId;

    private BigDecimal solverTaskId;

    private Date solverCreationTime;

    private String solverCreatedBy;

    private Date solverLastUpdateTime;

    public BigDecimal getSolverId() {
        return solverId;
    }

    public void setSolverId(BigDecimal solverId) {
        this.solverId = solverId;
    }

    public BigDecimal getSolverTaskId() {
        return solverTaskId;
    }

    public void setSolverTaskId(BigDecimal solverTaskId) {
        this.solverTaskId = solverTaskId;
    }

    public Date getSolverCreationTime() {
        return solverCreationTime;
    }

    public void setSolverCreationTime(Date solverCreationTime) {
        this.solverCreationTime = solverCreationTime;
    }

    public String getSolverCreatedBy() {
        return solverCreatedBy;
    }

    public void setSolverCreatedBy(String solverCreatedBy) {
        this.solverCreatedBy = solverCreatedBy == null ? null : solverCreatedBy.trim();
    }

    public Date getSolverLastUpdateTime() {
        return solverLastUpdateTime;
    }

    public void setSolverLastUpdateTime(Date solverLastUpdateTime) {
        this.solverLastUpdateTime = solverLastUpdateTime;
    }
}