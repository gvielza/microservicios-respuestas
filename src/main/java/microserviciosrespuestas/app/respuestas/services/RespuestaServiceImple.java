package microserviciosrespuestas.app.respuestas.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import microserviciosrespuestas.app.respuestas.models.entity.Respuesta;
import microserviciosrespuestas.app.respuestas.models.repository.RespuestaRepository;

@Service
public class RespuestaServiceImple implements RespuestaService {
	@Autowired
	private RespuestaRepository repositoryResp;

	@Override
	@Transactional
	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas) {
		return repositoryResp.saveAll(respuestas);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Respuesta> findRespuestaByAlumnoByExamen(Long alumnoId, Long examenId) {
		
		return repositoryResp.findRespuestaByAlumnoByExamen(alumnoId, examenId);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Long> findExamenesIdsConRespuestasByAlumno(Long alumnoId) {
		
		return repositoryResp.findExamenesIdsConRespuestasByAlumno(alumnoId);
	}

}
