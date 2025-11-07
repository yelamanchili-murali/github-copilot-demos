package com.mrydemos.bizrules.costing;

public class CostCalculator {
    public double calculateCost(Package pkg) {
        double cost = 0.0;

        // Rule 1-8: Domestic
        if (pkg.getDestinationType() == DestinationType.DOMESTIC) {
            if (pkg.getWeight() <= 5) {
                if (pkg.getDimensions() <= 1000) {
                    cost = pkg.getDeliverySpeed() == DeliverySpeed.STANDARD ? 10 : 20;
                } else {
                    cost = pkg.getDeliverySpeed() == DeliverySpeed.STANDARD ? 20 : 30;
                }
            } else {
                if (pkg.getDimensions() <= 1000) {
                    cost = pkg.getDeliverySpeed() == DeliverySpeed.STANDARD ? 15 : 25;
                } else {
                    cost = pkg.getDeliverySpeed() == DeliverySpeed.STANDARD ? 25 : 35;
                }
            }
        }
        // Rule 9-10: International
        else if (pkg.getDestinationType() == DestinationType.INTERNATIONAL) {
            cost = pkg.getDeliverySpeed() == DeliverySpeed.STANDARD ? 50 : 70;
        }

        // Rule 11-13: Special Handling
        for (SpecialHandling handling : pkg.getSpecialHandling()) {
            switch (handling) {
                case FRAGILE:
                    cost += 10;
                    break;
                case OVERSIZED:
                    cost += 20;
                    break;
                case HAZARDOUS:
                    cost += 30;
                    break;
                default:
                    break;
            }
        }

        return cost;
    }
}