package com.productservice.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.productservice.model.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequest {

    private Integer addressId;
    private String fullAddress;
    private String postalCode;
    private String city;

    @JsonProperty("user")
    @JsonInclude(value= JsonInclude.Include.NON_NULL)
    private UserRequest userRequest;

    public Address toAddressRequest()
    {
        Address address =new Address();
        address.setFullAddress(this.getFullAddress());
        address.setPostalCode(this.getPostalCode());
        address.setCity(this.getCity());

        return address;
    }


}
