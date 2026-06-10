package com.etitc.motorcyclesmanagment.repository;


    import org.springframework.stereotype.Repository;
    import com.etitc.motorcyclesmanagment.model.Moto;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    @Repository
    public interface MotoRepository extends JpaRepository<Moto, Long> {

}
