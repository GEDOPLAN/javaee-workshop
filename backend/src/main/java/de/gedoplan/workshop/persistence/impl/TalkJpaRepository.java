package de.gedoplan.workshop.persistence.impl;

import de.gedoplan.baselibs.persistence.repository.SingleIdEntityRepository;
import de.gedoplan.workshop.domain.Talk;
import de.gedoplan.workshop.persistence.TalkRepository;

import javax.ejb.Stateless;

//@ApplicationScoped
//@Transactional(rollbackOn = Exception.class)
@Stateless
// @TransactionAttribute
public class TalkJpaRepository extends SingleIdEntityRepository<Integer, Talk> implements TalkRepository {

  // @PersistenceContext(unitName="hugo")
  // @Override
  // public void setEntityManager(EntityManager entityManager) {
  // // TODO Auto-generated method stub
  // super.setEntityManager(entityManager);
  // }

  // List<Talk> findByType(TalkType talkType) { }
}
