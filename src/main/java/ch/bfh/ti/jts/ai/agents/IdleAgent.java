package ch.bfh.ti.jts.ai.agents;

import ch.bfh.ti.jts.ai.Decision;

public class IdleAgent extends RandomAgent {

    private static final long serialVersionUID = 1L;

    public IdleAgent() {
        super();
    }

    @Override
    public void think() {
        super.think();
        getDecision().setAcceleration(0);
        getDecision().setLaneChangeDirection(Decision.LaneChangeDirection.NONE);
    }
}
