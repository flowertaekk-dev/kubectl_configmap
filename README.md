# kubectl_configmap

## ConfigMap 생성하기

1. `test-configmap.yaml` 작성 (이름은 자유)
2. `kubectl apply -f test-configmap.yaml`
3. `kubectl get cm` 으로 생성된 ConfigMap 확인

`./deploy/test-configmap.yaml` 참조

## Pod 생성

1. `test-pod.yaml` 작성 (이름은 자유)
2. `kubectl apply -f test-pod.yaml`
3. `kubectl get po`

`./deploy/test-pod.yaml` 참조

## port-forward 로 포트 개방

제대로는 Service 작성해서 포트 연결하는게 옳지만 테스트니까!
```shell
## kubectl port-foward pod/<pod-name> 8080:8080
kubectl port-forward pod/kubectl-configmap 8080:8080
```



## reference
https://capgemini.github.io/engineering/externalising-spring-boot-config-with-kubernetes/