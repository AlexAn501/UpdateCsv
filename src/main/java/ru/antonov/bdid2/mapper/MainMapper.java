package ru.antonov.bdid2.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {

    Long getCitizenshipId();

    List<Long> getCitizenshipIds();
}
