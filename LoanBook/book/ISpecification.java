package book;

public interface ISpecification<T> {
	public boolean IsSatisfiedBy(T entity);
}
