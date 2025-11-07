## User Story: Implement Package Costing Decision Logic

### Overview
As the development team of QuickShip, a leading package delivery service, we need to implement a robust package costing decision logic that accurately calculates the cost of shipping packages based on various factors such as weight, dimensions, destination type (domestic or international), delivery speed, and special handling requirements. This logic must ensure competitive pricing and efficiency in our operations.

### Acceptance Criteria
1. **Complex Decision Logic:** The system must consider multiple factors (weight, dimensions, destination, delivery speed, and special handling) to determine the shipping cost.
2. **Accuracy:** The calculated shipping costs must be accurate and in line with the pricing strategy defined in the decision table.
3. **Flexibility:** The costing logic must be flexible enough to accommodate future changes in pricing strategy without significant refactoring.
4. **Performance:** The implementation must efficiently handle a high volume of cost calculations without a significant impact on performance.
5. **Testing:** Comprehensive unit tests must be written to cover all scenarios outlined in the decision table.

### Decision Table for Package Costing
The decision table below outlines the rules for calculating the shipping cost of packages. Each rule considers the factors of weight, dimensions (Length x Width x Height), destination, delivery speed, and any special handling requirements to determine the cost.

| Rule | Weight (kg) | Dimensions (cm³) | Destination | Delivery Speed | Special Handling | Cost (USD) |
|------|-------------|------------------|-------------|----------------|-------------------|------------|
| 1    | <= 5        | <= 1000          | Domestic    | Standard       | None              | 10         |
| 2    | <= 5        | <= 1000          | Domestic    | Express        | None              | 20         |
| 3    | > 5         | <= 1000          | Domestic    | Standard       | None              | 15         |
| 4    | > 5         | <= 1000          | Domestic    | Express        | None              | 25         |
| 5    | <= 5        | > 1000           | Domestic    | Standard       | None              | 20         |
| 6    | <= 5        | > 1000           | Domestic    | Express        | None              | 30         |
| 7    | > 5         | > 1000           | Domestic    | Standard       | None              | 25         |
| 8    | > 5         | > 1000           | Domestic    | Express        | None              | 35         |
| 9    | Any         | Any              | International | Standard    | None              | 50         |
| 10   | Any         | Any              | International | Express    | None              | 70         |
| 11   | Any         | Any              | Any         | Any            | Fragile           | +10        |
| 12   | Any         | Any              | Any         | Any            | Oversized         | +20        |
| 13   | Any         | Any              | Any         | Any            | Hazardous         | +30        |

### Notes
- The "Dimensions" field is calculated as Length x Width x Height in cubic centimeters.
- Special handling costs are additional to the base cost determined by weight, dimensions, destination, and delivery speed.
- If a package meets the criteria for more than one type of special handling, all applicable charges apply cumulatively.


---
