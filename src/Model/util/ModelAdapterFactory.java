/**
 */
package Model.util;

import Model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch modelSwitch =
		new ModelSwitch() {
			public Object caseTerminal(Terminal object) {
				return createTerminalAdapter();
			}
			public Object caseBiblioteca(Biblioteca object) {
				return createBibliotecaAdapter();
			}
			public Object caseExemplar(Exemplar object) {
				return createExemplarAdapter();
			}
			public Object caseUsuario(Usuario object) {
				return createUsuarioAdapter();
			}
			public Object caseAluno(Aluno object) {
				return createAlunoAdapter();
			}
			public Object caseProfessor(Professor object) {
				return createProfessorAdapter();
			}
			public Object caseBibliotecario(Bibliotecario object) {
				return createBibliotecarioAdapter();
			}
			public Object casePublicacao(Publicacao object) {
				return createPublicacaoAdapter();
			}
			public Object caseEmpréstimo(Empréstimo object) {
				return createEmpréstimoAdapter();
			}
			public Object caseLivro(Livro object) {
				return createLivroAdapter();
			}
			public Object casePeriodico(Periodico object) {
				return createPeriodicoAdapter();
			}
			public Object caseTese(Tese object) {
				return createTeseAdapter();
			}
			public Object caseManual(Manual object) {
				return createManualAdapter();
			}
			public Object caseAtendente(Atendente object) {
				return createAtendenteAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Model.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Terminal
	 * @generated
	 */
	public Adapter createTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Biblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Biblioteca
	 * @generated
	 */
	public Adapter createBibliotecaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Exemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Exemplar
	 * @generated
	 */
	public Adapter createExemplarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Usuario
	 * @generated
	 */
	public Adapter createUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Aluno
	 * @generated
	 */
	public Adapter createAlunoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Professor
	 * @generated
	 */
	public Adapter createProfessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Bibliotecario <em>Bibliotecario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Bibliotecario
	 * @generated
	 */
	public Adapter createBibliotecarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Publicacao <em>Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Publicacao
	 * @generated
	 */
	public Adapter createPublicacaoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Empréstimo <em>Empréstimo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Empréstimo
	 * @generated
	 */
	public Adapter createEmpréstimoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Livro <em>Livro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Livro
	 * @generated
	 */
	public Adapter createLivroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Periodico <em>Periodico</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Periodico
	 * @generated
	 */
	public Adapter createPeriodicoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Tese <em>Tese</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Tese
	 * @generated
	 */
	public Adapter createTeseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Manual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Manual
	 * @generated
	 */
	public Adapter createManualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Atendente <em>Atendente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Atendente
	 * @generated
	 */
	public Adapter createAtendenteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
