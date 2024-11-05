package com.seleniumexpress.adressapp.address_service.service;

import com.seleniumexpress.adressapp.address_service.entity.AddressEntity;
import com.seleniumexpress.adressapp.address_service.repo.AddressRepo;
import com.seleniumexpress.adressapp.address_service.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

public class AddressService {

        @Autowired
        private AddressRepo addressRepo;

        @Autowired
        private ModelMapper modelMapper;

        @Autowired
        AddressRepo addressRepo;

        public AddressResponse findAddressByEmployeeId(int employeeId){
            AddressEntity address = addressRepo.findAddressByEmployeeId(employeeId);

            AddressResponse addressReponse = modelMapper.map(address, AddressReponse.class);

            return addressReponse;
        }

    }
}
