package les21.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import les21.demo.domain.Bucket;


public interface BucketRepo extends JpaRepository<Bucket, Integer>{


}
