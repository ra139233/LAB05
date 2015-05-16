/**
 */
package Model.util;

import Model.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Model.ModelPackage
 * @generated
 */
public class ModelSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.TERMINAL: {
				Terminal terminal = (Terminal)theEObject;
				Object result = caseTerminal(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BIBLIOTECA: {
				Biblioteca biblioteca = (Biblioteca)theEObject;
				Object result = caseBiblioteca(biblioteca);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXEMPLAR: {
				Exemplar exemplar = (Exemplar)theEObject;
				Object result = caseExemplar(exemplar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.USUARIO: {
				Usuario usuario = (Usuario)theEObject;
				Object result = caseUsuario(usuario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALUNO: {
				Aluno aluno = (Aluno)theEObject;
				Object result = caseAluno(aluno);
				if (result == null) result = caseUsuario(aluno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROFESSOR: {
				Professor professor = (Professor)theEObject;
				Object result = caseProfessor(professor);
				if (result == null) result = caseUsuario(professor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BIBLIOTECARIO: {
				Bibliotecario bibliotecario = (Bibliotecario)theEObject;
				Object result = caseBibliotecario(bibliotecario);
				if (result == null) result = caseUsuario(bibliotecario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PUBLICACAO: {
				Publicacao publicacao = (Publicacao)theEObject;
				Object result = casePublicacao(publicacao);
				if (result == null) result = caseExemplar(publicacao);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EMPRÉSTIMO: {
				Empréstimo empréstimo = (Empréstimo)theEObject;
				Object result = caseEmpréstimo(empréstimo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LIVRO: {
				Livro livro = (Livro)theEObject;
				Object result = caseLivro(livro);
				if (result == null) result = casePublicacao(livro);
				if (result == null) result = caseExemplar(livro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PERIODICO: {
				Periodico periodico = (Periodico)theEObject;
				Object result = casePeriodico(periodico);
				if (result == null) result = casePublicacao(periodico);
				if (result == null) result = caseExemplar(periodico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TESE: {
				Tese tese = (Tese)theEObject;
				Object result = caseTese(tese);
				if (result == null) result = casePublicacao(tese);
				if (result == null) result = caseExemplar(tese);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MANUAL: {
				Manual manual = (Manual)theEObject;
				Object result = caseManual(manual);
				if (result == null) result = casePublicacao(manual);
				if (result == null) result = caseExemplar(manual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ATENDENTE: {
				Atendente atendente = (Atendente)theEObject;
				Object result = caseAtendente(atendente);
				if (result == null) result = caseUsuario(atendente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biblioteca</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biblioteca</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBiblioteca(Biblioteca object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exemplar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exemplar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExemplar(Exemplar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUsuario(Usuario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aluno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aluno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAluno(Aluno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProfessor(Professor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliotecario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliotecario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBibliotecario(Bibliotecario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publicacao</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publicacao</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePublicacao(Publicacao object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empréstimo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empréstimo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEmpréstimo(Empréstimo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Livro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Livro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLivro(Livro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePeriodico(Periodico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tese</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tese</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTese(Tese object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseManual(Manual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atendente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atendente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAtendente(Atendente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
