package me.dcal.meteo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dcal.meteo.model.Station;

import java.util.List;
import java.util.Optional;

@Repository
public interface  StationRepository extends JpaRepository<Station,Integer>
{
	List<Station> findAll();
}
