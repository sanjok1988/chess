package com.drewhannay.chesscrafter.rules.legaldestinationcropper;

public final class StationaryObjectiveLegalDestinationCropper extends LegalDestinationCropper {
    @Override
    public void cropLegalDestinations() {
        // TODO Auto-generated method stub
        // private void stationaryObjectiveCropLegalDestinations(PieceController
        // movingObjective, PieceController pieceToAdjust,
        // List<PieceController> enemyTeam)
        // {
        // if (pieceToAdjust == movingObjective)
        // pieceToAdjust.getLegalDests().clear();
        // else
        // pieceToAdjust.adjustPinsLegalDests(movingObjective, enemyTeam);
        // return;
        // }
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof StationaryObjectiveLegalDestinationCropper;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}