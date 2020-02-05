package com.online.banking.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
public interface IRepository <T>  extends JpaRepository<T, Long> , PagingAndSortingRepository<T, Long> {

}
