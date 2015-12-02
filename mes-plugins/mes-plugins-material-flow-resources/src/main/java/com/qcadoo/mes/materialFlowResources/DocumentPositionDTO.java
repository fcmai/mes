package com.qcadoo.mes.materialFlowResources;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class DocumentPositionDTO {

    private Long id;
    private String product;
    private String additional_code;
    private BigDecimal quantity;
    private BigDecimal givenquantity;
    private String givenunit;
    private BigDecimal conversion;
    private Date expirationdate;
    private String pallet;
    private String type_of_pallet;
    private String storage_location;
//    private Long resource_id;
}