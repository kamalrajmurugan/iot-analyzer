package com.java.relay42.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.UUID;

/**
 * A Device entity class
 */
@Table("device")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Device extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private UUID id;


    private UUID stationId;


    private String stationName;


    private String deviceName;

    private String clientName;

    private String location;

    private String unit;

    /*@CassandraType(type = DataType.Name.UDT, userTypeName = "readings")
    private Set<Readings> readings = new HashSet<>();*/

}